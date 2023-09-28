export default function () {
  return {
    pollutantFriendlyName: "",
    pollutantName: "",
    pollutantId: null,
    populationDatasetId: null,
    populationDatasetName: "",
    populationYearsSelected: [],
    populationYears: [],
    populationGroups: [],
    populationGroupIds: [],
    populationGroupNames: [],
    prePolicyAirQualityId: null,
    prePolicyAirQualityName: "",
    prePolicyAirQualityMetricId: null,
    postPolicyAirQualityId: [],
    postPolicyAirQualityName: [],
    postPolicyAirQualitySelection: null,
    postPolicyAirQualityMetricId: [],
    exposureFunctionGroup: null,
    exposureFunctionGroupId: null,
    exposureFunctionGroupName: null,
    location,
    airQualityLayers: null,
    stepNumber: 1,
    applyYearsToAll: false,
    batchTaskObject: null,
  }
}
