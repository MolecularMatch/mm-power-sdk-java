# SearchResponseDrugRows

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mboost** | **Float** |  |  [optional]
**analyzer** | [**AnalyzerEnum**](#AnalyzerEnum) |  |  [optional]
**id** | **String** |  | 
**source** | **String** |  | 
**name** | **String** |  | 
**nameLower** | **String** |  | 
**alias** | **String** |  |  [optional]
**exclude** | **Boolean** |  |  [optional]
**custom** | **Boolean** |  |  [optional]
**description** | **String** |  |  [optional]
**composite** | **Boolean** |  |  [optional]
**suppressResistance** | **Boolean** |  |  [optional]
**approved** | **Boolean** |  | 
**availability** | [**List&lt;DrugAvailability&gt;**](DrugAvailability.md) |  |  [optional]
**synonyms** | [**List&lt;DrugSynonyms&gt;**](DrugSynonyms.md) |  |  [optional]
**parents** | [**List&lt;DrugParents&gt;**](DrugParents.md) |  |  [optional]
**drugclass** | [**List&lt;DrugDrugclass&gt;**](DrugDrugclass.md) |  |  [optional]
**compositeTags** | [**List&lt;DrugCompositeTags&gt;**](DrugCompositeTags.md) |  |  [optional]
**brands** | [**List&lt;DrugBrands&gt;**](DrugBrands.md) |  |  [optional]
**indicationText** | **String** |  |  [optional]
**contraindicationText** | **String** |  |  [optional]
**mechanismText** | **String** |  |  [optional]
**rxcui** | **List&lt;String&gt;** |  |  [optional]
**externalIds** | [**List&lt;DrugExternalIds&gt;**](DrugExternalIds.md) |  |  [optional]
**link** | **String** |  |  [optional]
**prices** | [**List&lt;DrugPrices&gt;**](DrugPrices.md) |  |  [optional]
**dosages** | [**List&lt;DrugDosages&gt;**](DrugDosages.md) |  |  [optional]
**pharmacology** | [**DrugPharmacology**](DrugPharmacology.md) |  |  [optional]
**phaseAndTrialsScore** | **Float** |  |  [optional]
**_valid** | **Object** |  |  [optional]
**_validMessage** | **String** |  |  [optional]

<a name="AnalyzerEnum"></a>
## Enum: AnalyzerEnum
Name | Value
---- | -----
DEFAULT | &quot;DEFAULT&quot;
CASE_SENSITIVE | &quot;CASE_SENSITIVE&quot;
