# AssertionClassifications

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Mutation name. | 
**classification** | [**ClassificationEnum**](#ClassificationEnum) | Clinical actionability of mutation. | 
**classificationOverride** | [**ClassificationOverrideEnum**](#ClassificationOverrideEnum) | Manual override of classification. |  [optional]

<a name="ClassificationEnum"></a>
## Enum: ClassificationEnum
Name | Value
---- | -----
ACTIONABLE | &quot;actionable&quot;
UNKNOWN | &quot;unknown&quot;
COMMON | &quot;common&quot;
INFORMATIVE | &quot;informative&quot;
GERMLINE | &quot;germline&quot;

<a name="ClassificationOverrideEnum"></a>
## Enum: ClassificationOverrideEnum
Name | Value
---- | -----
ACTIONABLE | &quot;actionable&quot;
UNKNOWN | &quot;unknown&quot;
COMMON | &quot;common&quot;
INFORMATIVE | &quot;informative&quot;
GERMLINE | &quot;germline&quot;
