# Drug

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_score** | **Float** | indicator of the quality of the match. |  [optional]
**mboost** | **Float** | intrinsic boost to the record. |  [optional]
**id** | **String** | unique identifier. |  [optional]
**name** | **String** | The name of the drug. |  [optional]
**alias** | **String** | The most common name for the drug. |  [optional]
**description** | **String** | Descriptions of drug properties, treatments, history and regulatory status. |  [optional]
**composite** | **Boolean** | Indicates whether this drug is a composite of multiple drugs (combination therapy). |  [optional]
**approved** | **Boolean** | Indicates whether this drug has been approved by any regulating government. |  [optional]
**availability** | [**java.util.List&lt;DrugAvailability&gt;**](DrugAvailability.md) | Countries or jurisdictions where this drug is available. |  [optional]
**synonyms** | [**java.util.List&lt;Synonym&gt;**](Synonym.md) | Other names or identifiers that are associated with this drug. |  [optional]
**parents** | [**java.util.List&lt;DrugParents&gt;**](DrugParents.md) |  |  [optional]
**drugclass** | [**java.util.List&lt;DrugDrugclass&gt;**](DrugDrugclass.md) | The classes (pharmacological, treatment, chemical, etc.) of the drug inferred from the source or manually added. |  [optional]
**compositeTags** | [**java.util.List&lt;DrugCompositeTags&gt;**](DrugCompositeTags.md) | The individual drugs making up this composite drug |  [optional]
**brands** | [**java.util.List&lt;DrugBrands&gt;**](DrugBrands.md) | The manufacturer specific rendition of this drug. |  [optional]
**externalIds** | [**java.util.List&lt;ExternalId&gt;**](ExternalId.md) | Identifiers used in other websites or databases providing information about this drug. |  [optional]
**link** | **String** | DailyMed link for prescription label details. |  [optional]
**prices** | [**java.util.List&lt;DrugPrices&gt;**](DrugPrices.md) | Unit drug prices. |  [optional]
**dosages** | [**java.util.List&lt;DrugDosages&gt;**](DrugDosages.md) | A list of the commercially available dosages of the drug. |  [optional]
**pharmacology** | [**DrugPharmacology**](DrugPharmacology.md) |  |  [optional]
**molecularAlterations** | [**java.util.List&lt;ConceptAssociation&gt;**](ConceptAssociation.md) | Molecular concept associations established for this drug. |  [optional]
**contraindicatedAlterations** | [**java.util.List&lt;ConceptAssociation&gt;**](ConceptAssociation.md) | Contraindicated Molecular concept associations established for this drug. |  [optional]
**assertions** | [**java.util.List&lt;Assertion&gt;**](Assertion.md) | Evidence in support of this drug. |  [optional]
**bestTier** | **String** | The highest tier evidence associated with this drug. |  [optional]
**metTier** | **String** | The highest tier evidence associated with this drug where the criteria is fully met based on the search inputs. |  [optional]
