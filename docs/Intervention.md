# Intervention

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**interventionType** | [**InterventionTypeEnum**](#InterventionTypeEnum) | For each intervention studied in the clinical study, the general type of intervention. |  [optional]
**interventionName** | **String** | A brief descriptive name used to refer to the intervention(s) studied in each arm of the clinical study. | 
**description** | **String** | Details that can be made public about the intervention, other than the Intervention Name(s) and Other Intervention Name(s), sufficient to distinguish the intervention from other, similar interventions studied in the same or another clinical study. For example, interventions involving drugs may include dosage form, dosage, frequency, and duration. |  [optional]
**armGroupLabel** | **java.util.List&lt;String&gt;** | If multiple Arms or Groups have been specified, indicate which Arm Groups this intervention applies to. |  [optional]
**otherName** | **java.util.List&lt;String&gt;** |  |  [optional]

<a name="InterventionTypeEnum"></a>
## Enum: InterventionTypeEnum
Name | Value
---- | -----
BEHAVIORAL | &quot;Behavioral&quot;
BIOLOGICAL | &quot;Biological&quot;
COMBINATION_PRODUCT | &quot;Combination Product&quot;
DEVICE | &quot;Device&quot;
DIAGNOSTIC_TEST | &quot;Diagnostic Test&quot;
DIETARY_SUPPLEMENT | &quot;Dietary Supplement&quot;
DRUG | &quot;Drug&quot;
GENETIC | &quot;Genetic&quot;
PROCEDURE | &quot;Procedure&quot;
RADIATION | &quot;Radiation&quot;
OTHER | &quot;Other&quot;
