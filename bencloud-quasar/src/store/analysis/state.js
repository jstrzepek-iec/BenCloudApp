export default function () {
  return {
    pollutantFriendlyName: "",
    pollutantName: "",
    pollutantId: null,
    incidenceId: null,
    incidenceName: "",
    populationDatasetId: null,
    populationDatasetName: "",
    populationYearsSelected: [],
    populationYears: [],
    healthEffects: [],
    healthImpactFunctions: [],
    prePolicyAirQualityId: null,
    prePolicyAirQualityName: "",
    prePolicyAirQualityMetricId: null,
    postPolicyAirQualityId: [],
    postPolicyAirQualityName: [],
    postPolicyAirQualitySelection: null,
    postPolicyAirQualityMetricId: [],
    valuationsForHealthImpactFunctionGroups: [],
    location,
    airQualityLayers: null,
    stepNumber: 1,
    aggregationScale: null,
    applyYearsToAll: false,
    batchTaskObject: null,
    inflationYear: null,
    useDecliningDR: false,
    discountRate: 0,
    valuationSelection: "Select my own value functions",
  }
}
