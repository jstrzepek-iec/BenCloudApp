package gov.epa.bencloud.server.routes;

import java.util.HashMap;
import java.util.Map;

import org.jooq.Record;
import org.jooq.Result;
import org.jooq.impl.DSL;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import freemarker.template.Configuration;
import gov.epa.bencloud.server.database.JooqUtil;
import gov.epa.bencloud.server.util.FreeMarkerRenderUtil;
import spark.Service;

public class AdminRoutes {

	private static final Logger log = LoggerFactory.getLogger(AdminRoutes.class);
	private Service service = null;

	public AdminRoutes(Service service, Configuration freeMarkerConfiguration){
		this.service = service;
		addRoutes(freeMarkerConfiguration);
	}

	private void addRoutes(Configuration freeMarkerConfiguration) {

		service.get("/db", (req, res) -> {
			
			Map<String, Object> attributes = new HashMap<>();
			
			attributes.put("database_status", "Got a database connection");
							
			String sql = "SELECT CURRENT_DATE";

			Result<Record> result = DSL.using(JooqUtil.getJooqConfiguration()).fetch(sql);
			attributes.put("result", result.get(0).get(0));
			
			return FreeMarkerRenderUtil.render(freeMarkerConfiguration, attributes, "db.ftl");
		});

		service.get("/exit", (req, res) -> {
			service.stop();
			System.exit(0);
			System.out.println("shutting down....");
			return "";
		});

	}

}
