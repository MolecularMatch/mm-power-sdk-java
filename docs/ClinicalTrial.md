# ClinicalTrial

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_score** | **Float** | indicator of the quality of the match. |  [optional]
**mboost** | **Float** | intrinsic boost to the record. |  [optional]
**importDate** | [**OffsetDateTime**](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) | date this record was imported into the MolecularMatch database. |  [optional]
**id** | **String** | unique identifier. |  [optional]
**source** | **String** | native data source of this record |  [optional]
**visibleTo** | **java.util.List&lt;String&gt;** | Public trials (those listed in a public registry) will be visible to all, and private trials will indicate the institutions that this trial is visible to. |  [optional]
**institutionId** | **String** | If private trial, this is the governing institution. |  [optional]
**briefTitle** | **String** | A short title of the clinical study written in language intended for the lay public. The title should include, where possible, information on the participants, condition being evaluated, and intervention(s) studied. |  [optional]
**patientTitle** | **String** | Patient friendly title for the clinical trial. |  [optional]
**title** | **String** | Official title for the clinical trial. |  [optional]
**briefSummary** | **String** | A short description of the clinical study, including a brief statement of the clinical study&#x27;s hypothesis, written in language intended for the lay public. |  [optional]
**briefSummaryPreserved** | **String** | Formatted rendition of the briefSummary. |  [optional]
**summary** | **String** | Extended description of the protocol, including more technical information (as compared to the Brief Summary), if desired. Do not include the entire protocol; do not duplicate information recorded in other data elements, such as Eligibility Criteria or outcome measures. |  [optional]
**summaryPreserved** | **String** | Formatted rendition of the summary. |  [optional]
**status** | **String** | Trial recruiting status. |  [optional]
**phase** | **String** | For a clinical trial of a drug product (including a biological product), the numerical phase of such clinical trial, consistent with terminology in 21 CFR 312.21 and in 21 CFR 312.85 for phase 4 studies. |  [optional]
**studyType** | **String** | The nature of the investigation or investigational use for which clinical study information is being submitted. |  [optional]
**studyDesign** | [**StudyDesign**](StudyDesign.md) |  |  [optional]
**startDate** | [**OffsetDateTime**](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) | The estimated date on which the clinical study will be open for recruitment of participants, or the actual date on which the first participant was enrolled. |  [optional]
**completionDate** | [**OffsetDateTime**](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) | The date the final participant was examined or received an intervention for purposes of final collection of data for the primary and secondary outcome measures and adverse events (for example, last participant’s last visit), whether the clinical study concluded according to the pre-specified protocol or was terminated |  [optional]
**firstReceivedDate** | [**OffsetDateTime**](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) | The date on which the study sponsor or investigator first submitted a study record to the trial registry (see source field). |  [optional]
**lastChangedDate** | [**OffsetDateTime**](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) | The most recent date that any information was updated for this trial. |  [optional]
**verificationDate** | [**OffsetDateTime**](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) | The date on which the responsible party last verified the clinical study information in the entire ClinicalTrials.gov record for the clinical study, even if no additional or updated information is being submitted. |  [optional]
**sponsors** | [**java.util.List&lt;ClinicalTrialSponsors&gt;**](ClinicalTrialSponsors.md) | The list of organizations or persons who initiated the study and who have authority and control over the study. |  [optional]
**conditions** | **java.util.List&lt;String&gt;** | Diseases/Conditions related to this trial. |  [optional]
**interventions** | [**java.util.List&lt;Intervention&gt;**](Intervention.md) | Specifies the intervention(s) associated with each arm or group. |  [optional]
**keywords** | **java.util.List&lt;String&gt;** | Words or phrases that best describe the protocol. Keywords help users find studies in the database. Use NLM&#x27;s Medical Subject Heading (MeSH)-controlled vocabulary terms where appropriate. Be as specific and precise as possible. |  [optional]
**armGroups** | [**java.util.List&lt;ArmGroup&gt;**](ArmGroup.md) | Pre-specified groups of participants in a clinical trial assigned to receive specific interventions (or no intervention) according to a protocol. |  [optional]
**primaryOutcomes** | [**java.util.List&lt;Outcome&gt;**](Outcome.md) | The outcome that an investigator considers to be the most important among the many outcomes that are to be examined in the study. |  [optional]
**secondaryOutcomes** | [**java.util.List&lt;Outcome&gt;**](Outcome.md) |  |  [optional]
**otherOutcomes** | [**java.util.List&lt;Outcome&gt;**](Outcome.md) |  |  [optional]
**eligibility** | [**Eligibility**](Eligibility.md) |  |  [optional]
**enrollment** | **Integer** | The estimated total number of participants to be enrolled (target number) or the actual total number of participants that are enrolled in the clinical study. |  [optional]
**minAge** | **Float** | The numerical value, if any, for the minimum age a potential participant must meet to be eligible for the clinical study. |  [optional]
**maxAge** | **Float** | The numerical value, if any, for the maximum age a potential participant can be to be eligible for the clinical study. |  [optional]
**gender** | **java.util.List&lt;String&gt;** | The sex and, if applicable, gender of the participants eligible to participate in the clinical study. |  [optional]
**overallOfficial** | [**java.util.List&lt;Contact&gt;**](Contact.md) | Person responsible for the overall scientific leadership of the protocol, including study principal investigator. |  [optional]
**overallContact** | [**Contact**](Contact.md) |  |  [optional]
**overallContactBackup** | [**Contact**](Contact.md) |  |  [optional]
**locationSummary** | [**ClinicalTrialLocationSummary**](ClinicalTrialLocationSummary.md) |  |  [optional]
**locations** | [**java.util.List&lt;Facility&gt;**](Facility.md) | Information about the sites offering this trial. |  [optional]
**countries** | [**java.util.List&lt;ClinicalTrialCountries&gt;**](ClinicalTrialCountries.md) | Countries with sites offering this trial. |  [optional]
**inclusionCriteria** | **String** | A limited list of criteria for selection of participants in the clinical study, provided in terms of inclusion criteria and suitable for assisting potential participants in identifying clinical studies of interest. |  [optional]
**inclusionCriteriaPreserved** | **String** | Formatted rendition of the inclusionCriteria. |  [optional]
**exclusionCriteria** | **String** | A limited list of criteria for selection of participants in the clinical study, provided in terms of exclusion criteria and suitable for assisting potential participants in identifying clinical studies of interest. |  [optional]
**exclusionCriteriaPreserved** | **String** | Formatted rendition of the exclusionCriteria. |  [optional]
**synonyms** | [**java.util.List&lt;Synonym&gt;**](Synonym.md) | Any identifier other than the organization&#x27;s Unique Protocol Identification Number or the NCT number that is assigned to the clinical study. |  [optional]
**acronym** | **String** | An acronym or abbreviation used publicly to identify the clinical study. |  [optional]
**link** | **String** | URL to registry listing of this trial. |  [optional]
**tags** | [**java.util.List&lt;Tag&gt;**](Tag.md) | Concept associations established for this trial. |  [optional]
**molecularAlterations** | [**java.util.List&lt;ConceptAssociation&gt;**](ConceptAssociation.md) | Molecular concept associations established for this trial. |  [optional]
**_stats** | **Object** |  |  [optional]
