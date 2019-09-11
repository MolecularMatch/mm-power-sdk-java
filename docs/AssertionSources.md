# AssertionSources

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique source identifier for this assertion. | 
**type** | [**TypeEnum**](#TypeEnum) | Type of clinical evidence associated with publication. |  [optional]
**subType** | [**SubTypeEnum**](#SubTypeEnum) | A more specific sub type of clinical evidence associated with publication. |  [optional]
**pubId** | **String** | A publication identifier. |  [optional]
**trialId** | **String** | A clinical trial identifier. |  [optional]
**trialPhase** | **String** | A clinical trial phase. |  [optional]
**functionalConsequence** | [**FunctionalConsequenceEnum**](#FunctionalConsequenceEnum) | Change to function of biomarker. |  [optional]
**name** | [**NameEnum**](#NameEnum) | Name of publication index if applicable. |  [optional]
**link** | **String** | A URL to publication if available. |  [optional]
**year** | **Integer** | Year of publication. |  [optional]
**trustRating** | **Float** | A subjective assessment of evidence quality. |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
TRIAL | &quot;trial&quot;
CASE_STUDY | &quot;case_study&quot;
PRECLINICAL | &quot;preclinical&quot;
EXPERT | &quot;expert&quot;
PATHWAY_INFERRED | &quot;pathway_inferred&quot;
INSTITUTIONAL_STUDY | &quot;institutional_study&quot;
REGULATORY | &quot;regulatory&quot;
SEQUENCING | &quot;sequencing&quot;
EMPTY | &quot;&quot;

<a name="SubTypeEnum"></a>
## Enum: SubTypeEnum
Name | Value
---- | -----
PROSPECTIVE | &quot;prospective&quot;
RETROSPECTIVE | &quot;retrospective&quot;
META_ANALYSIS | &quot;meta_analysis&quot;
CLINICAL | &quot;clinical&quot;
RESEARCHER | &quot;researcher&quot;
CELL_LINE | &quot;cell_line&quot;
PDX | &quot;pdx&quot;
BIOCHEMICAL_ASSAY | &quot;biochemical_assay&quot;
MOUSE_MODEL | &quot;mouse_model&quot;

<a name="FunctionalConsequenceEnum"></a>
## Enum: FunctionalConsequenceEnum
Name | Value
---- | -----
LOSS_OF_FUNCTION | &quot;loss_of_function&quot;
GAIN_OF_FUNCTION | &quot;gain_of_function&quot;
UNCHARACTERIZED | &quot;uncharacterized&quot;
INCONCLUSIVE | &quot;inconclusive&quot;

<a name="NameEnum"></a>
## Enum: NameEnum
Name | Value
---- | -----
PUBMED | &quot;PUBMED&quot;
AACR | &quot;AACR&quot;
ASCO | &quot;ASCO&quot;
ESMO | &quot;ESMO&quot;
