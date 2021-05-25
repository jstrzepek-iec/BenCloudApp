package gov.epa.bencloud.server.routes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import freemarker.template.Configuration;
import gov.epa.bencloud.api.AirQualityApi;
import spark.Service;

public class ApiRoutes extends RoutesBase {

	private static final Logger log = LoggerFactory.getLogger(ApiRoutes.class);
	private Service service = null;

	public ApiRoutes(Service service, Configuration freeMarkerConfiguration){
		this.service = service;
		addRoutes(freeMarkerConfiguration);
	}

	private void addRoutes(Configuration freeMarkerConfiguration) {

		// GET	
		service.get("/api/v1/air-quality-data", (request, response) -> {
			return AirQualityApi.getAllAirQualityLayerDefinitions(response);
		});

		service.get("/api/v1/air-quality-data/:id/definition", (request, response) -> {
			return AirQualityApi.getAirQualityLayerDefintion(request, response);
		});

		service.get("/api/v1/air-quality-data/:id/details", (request, response) -> {
			return AirQualityApi.getAirQualityLayerDetails(request, response);
		});
		
		// POST
		service.post("/api/v1/air-quality-data", (request, response) -> {
			String layerName = getPostParameterValue(request, "name");
			Integer pollutantId = Integer.valueOf(getPostParameterValue(request, "pollutantId"));
			Integer gridId = Integer.valueOf(getPostParameterValue(request, "gridId"));
			String layerType = getPostParameterValue(request, "type");
			return AirQualityApi.postAirQualityLayer(request, layerName, pollutantId, gridId, layerType, response);
		});

	}







}
