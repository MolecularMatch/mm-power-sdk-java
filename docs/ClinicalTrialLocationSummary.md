# ClinicalTrialLocationSummary

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**us** | **Boolean** | Indicates if there are United States based locations. |  [optional]
**intl** | **Boolean** | Indicates if there are locations outside of the United States. |  [optional]
**count** | **Float** | The number of trial sites. |  [optional]
**recruitingCount** | **Float** | The number of trial sites that are recruiting patients. |  [optional]
**countries** | [**java.util.List&lt;ClinicalTrialLocationSummaryCountries&gt;**](ClinicalTrialLocationSummaryCountries.md) | Countries with locations offering this trial. |  [optional]
**nearestDistance** | **Float** | The distance to the nearest trial location based on the distance unit of measure specified (miles if unspecified) from the search location (either geopoint, location object, or inferred search point bsaed on filters provided. |  [optional]
**nearestLocation** | [**Facility**](Facility.md) |  |  [optional]
