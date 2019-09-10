# Publication

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_score** | **Float** | indicator of the quality of the match. |  [optional]
**mboost** | **Float** | intrinsic boost to the record. |  [optional]
**id** | **String** | unique identifier. | 
**pmid** | **String** | PubMed ID. |  [optional]
**doi** | **String** | Digital Object Identifier (permanent link at doi.org/[doi]). |  [optional]
**source** | **String** | data source of this record | 
**journalName** | **String** | Journal name. | 
**journalISOAbbreviation** | **String** |  |  [optional]
**title** | **String** | Official title for the publication. | 
**purpose** | **String** | Abstract&#x27;s purpose section. |  [optional]
**background** | **String** | Abstract&#x27;s background section. |  [optional]
**methods** | **String** | Abstract&#x27;s methods section. |  [optional]
**results** | **String** | Abstract&#x27;s results section. |  [optional]
**conclusion** | **String** | Abstract&#x27;s conclusion section. |  [optional]
**conflicts** | **String** | Author&#x27;s conflicts of interest section. |  [optional]
**fulltext** | **String** | Full text (if available). |  [optional]
**citation** | **String** | MLA formatted citation. | 
**citationDate** | [**OffsetDateTime**](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) | Article date used for citation | 
**link** | **String** | Link to original source. |  [optional]
**chemicals** | **java.util.List&lt;String&gt;** | Chemicals or drugs referenced in this publication. |  [optional]
**keywords** | **java.util.List&lt;String&gt;** |  |  [optional]
**extendedKeywords** | **java.util.List&lt;String&gt;** |  |  [optional]
**publicationType** | **java.util.List&lt;String&gt;** | Publication types infered by MM. |  [optional]
**authors** | [**java.util.List&lt;PublicationAuthors&gt;**](PublicationAuthors.md) |  |  [optional]
**tags** | [**java.util.List&lt;Tag&gt;**](Tag.md) | Concept associations established for this publication. |  [optional]
**molecularAlterations** | [**java.util.List&lt;ConceptAssociation&gt;**](ConceptAssociation.md) | Molecular concept associations established for this publication. |  [optional]
