# Drug

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mboost** | **Float** | intrinsic boost to the record. |  [optional]
**id** | **String** | unique identifier. | 
**name** | **String** | The name of the drug. | 
**alias** | **String** | The most common name for the drug. |  [optional]
**description** | **String** | Descriptions of drug chemical properties, history and regulatory status. |  [optional]
**composite** | **Boolean** |  |  [optional]
**approved** | **Boolean** | Indicates whether this drug has been approved by any regulating government. | 
**suppressResistance** | **Boolean** |  |  [optional]
**suppressSynonymResistance** | **Boolean** |  |  [optional]
**availability** | [**java.util.List&lt;DrugAvailability&gt;**](DrugAvailability.md) | Countries or jurisdictions where this drug is available. |  [optional]
**synonyms** | [**java.util.List&lt;Synonym&gt;**](Synonym.md) | Other names or identifiers that are associated with this drug. |  [optional]
**parents** | [**java.util.List&lt;DrugParents&gt;**](DrugParents.md) |  |  [optional]
**drugclass** | [**java.util.List&lt;DrugDrugclass&gt;**](DrugDrugclass.md) |  |  [optional]
**compositeTags** | [**java.util.List&lt;DrugCompositeTags&gt;**](DrugCompositeTags.md) |  |  [optional]
**brands** | [**java.util.List&lt;DrugBrands&gt;**](DrugBrands.md) |  |  [optional]
**indicationText** | **String** |  |  [optional]
**contraindicationText** | **String** |  |  [optional]
**mechanismText** | **String** |  |  [optional]
**rxcui** | **java.util.List&lt;String&gt;** |  |  [optional]
**drugclassCausedSuppress** | **java.util.List&lt;String&gt;** |  |  [optional]
**externalIds** | [**java.util.List&lt;ExternalId&gt;**](ExternalId.md) | Identifiers used in other websites or databases providing information about this drug. |  [optional]
**link** | **String** |  |  [optional]
**prices** | [**java.util.List&lt;DrugPrices&gt;**](DrugPrices.md) | Unit drug prices. |  [optional]
**dosages** | [**java.util.List&lt;DrugDosages&gt;**](DrugDosages.md) | A list of the commercially available dosages of the drug. |  [optional]
**pharmacology** | [**DrugPharmacology**](DrugPharmacology.md) |  |  [optional]
**phaseAndTrialsScore** | **Float** |  |  [optional]
