# PrivateTrial

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**institutionId** | **String** | Unique institution identifier. |  [optional]
**institutionStudyId** | **String** | Unique study identifier. |  [optional]
**registryId** | **String** | The public registry study id.  This is only populated once the trial is no longer a private trial. |  [optional]
**visibleToIDN** | **Boolean** | If true, then this trial will be visible to the entire IDN, else it is visible only to the owning institution. |  [optional]
**briefTitle** | **String** | A short title of the clinical study written in language intended for the lay public. The title should include, where possible, information on the participants, condition being evaluated, and intervention(s) studied. |  [optional]
**acronym** | **java.util.List&lt;String&gt;** | Acronyms or abbreviations used publicly to identify the clinical study. |  [optional]
**officialTitle** | **String** | Official title for the clinical trial. |  [optional]
**sponsors** | [**java.util.List&lt;ClinicalTrialSponsors&gt;**](ClinicalTrialSponsors.md) | The list of organizations or persons who initiated the study and who have authority and control over the study. |  [optional]
**source** | **String** | Native data source of this record |  [optional]
**oversight** | [**Oversight**](Oversight.md) |  |  [optional]
**briefSummary** | **String** | A short description of the clinical study, including a brief statement of the clinical study&#x27;s hypothesis, written in language intended for the lay public. |  [optional]
**detailedDescription** | **String** | Extended description of the protocol, including more technical information (as compared to the Brief Summary), if desired. Do not include the entire protocol; do not duplicate information recorded in other data elements, such as Eligibility Criteria or outcome measures. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Trial recruiting status. |  [optional]
**startDate** | [**OffsetDateTime**](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) | The estimated date on which the clinical study will be open for recruitment of participants, or the actual date on which the first participant was enrolled. |  [optional]
**completionDate** | [**OffsetDateTime**](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) | The date the final participant was examined or received an intervention for purposes of final collection of data for the primary and secondary outcome measures and adverse events (for example, last participant’s last visit), whether the clinical study concluded according to the pre-specified protocol or was terminated |  [optional]
**phase** | [**PhaseEnum**](#PhaseEnum) | For a clinical trial of a drug product (including a biological product), the numerical phase of such clinical trial, consistent with terminology in 21 CFR 312.21 and in 21 CFR 312.85 for phase 4 studies. |  [optional]
**studyType** | [**StudyTypeEnum**](#StudyTypeEnum) | The nature of the investigation or investigational use for which clinical study information is being submitted. |  [optional]
**hasExpandedAccess** | **Boolean** | Whether there is expanded access to the investigational product for patients who do not qualify for enrollment in a clinical trial. Expanded Access for investigational drug products (including biological products) includes all expanded access types under section 561 of the Federal Food, Drug, and Cosmetic Act: (1) for individual participants, including emergency use; (2) for intermediate-size participant populations; and (3) under a treatment IND or treatment protocol. |  [optional]
**expandedAccess** | [**ExpandedAccess**](ExpandedAccess.md) |  |  [optional]
**studyDesign** | [**StudyDesign**](StudyDesign.md) |  |  [optional]
**primaryOutcome** | [**java.util.List&lt;Outcome&gt;**](Outcome.md) | The outcome that an investigator considers to be the most important among the many outcomes that are to be examined in the study. |  [optional]
**secondaryOutcome** | [**java.util.List&lt;Outcome&gt;**](Outcome.md) |  |  [optional]
**otherOutcome** | [**java.util.List&lt;Outcome&gt;**](Outcome.md) |  |  [optional]
**numberOfArms** | **Integer** | The number of trial arms. |  [optional]
**numberOfGroups** | **Integer** | The number of trial groups. |  [optional]
**enrollment** | **Integer** | The estimated total number of participants to be enrolled (target number) or the actual total number of participants that are enrolled in the clinical study. |  [optional]
**condition** | **java.util.List&lt;String&gt;** | Diseases/Conditions related to this trial. |  [optional]
**armGroup** | [**java.util.List&lt;ArmGroup&gt;**](ArmGroup.md) | Pre-specified groups of participants in a clinical trial assigned to receive specific interventions (or no intervention) according to a protocol. |  [optional]
**intervention** | [**java.util.List&lt;Intervention&gt;**](Intervention.md) | Specifies the intervention(s) associated with each arm or group. |  [optional]
**biospecRetention** | [**BiospecRetentionEnum**](#BiospecRetentionEnum) |  |  [optional]
**biospecDescr** | **String** |  |  [optional]
**eligibility** | [**Eligibility**](Eligibility.md) |  |  [optional]
**overallOfficial** | [**java.util.List&lt;Contact&gt;**](Contact.md) | Person responsible for the overall scientific leadership of the protocol, including study principal investigator. |  [optional]
**overallContact** | [**Contact**](Contact.md) |  |  [optional]
**overallContactBackup** | [**Contact**](Contact.md) |  |  [optional]
**location** | [**java.util.List&lt;Facility&gt;**](Facility.md) | Information about the sites offering this trial. |  [optional]
**locationCountries** | **java.util.List&lt;String&gt;** | Countries with sites offering this trial. |  [optional]
**link** | **String** | URL to institution (if private) or registry listing of this trial. |  [optional]
**reference** | [**java.util.List&lt;Reference&gt;**](Reference.md) | Reference publications pertaining to this trial. |  [optional]
**verificationDate** | [**OffsetDateTime**](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) | The date on which the responsible party last verified the clinical study information in the entire ClinicalTrials.gov record for the clinical study, even if no additional or updated information is being submitted. |  [optional]
**studyFirstSubmitted** | [**OffsetDateTime**](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) | The date on which the study sponsor or investigator first submitted a study record to the trial registry. |  [optional]
**studyFirstPosted** | [**OffsetDateTime**](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) | The date on which the study was first made public on trial registry. |  [optional]
**lastUpdatePosted** | [**OffsetDateTime**](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) | The most recent date that any information was updated for this trial. |  [optional]
**keyword** | **java.util.List&lt;String&gt;** | Words or phrases that best describe the protocol. Keywords help users find studies in the database. Use NLM&#x27;s Medical Subject Heading (MeSH)-controlled vocabulary terms where appropriate. Be as specific and precise as possible. |  [optional]
**responsibleParty** | [**java.util.List&lt;ResponsibleParty&gt;**](ResponsibleParty.md) | The entities and individuals responsible for this trial. |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ACTIVE_NOT_RECRUITING | &quot;Active, not recruiting&quot;
APPROVED_FOR_MARKETING | &quot;Approved for marketing&quot;
AVAILABLE | &quot;Available&quot;
COMPLETED | &quot;Completed&quot;
ENROLLING_BY_INVITATION | &quot;Enrolling by invitation&quot;
NO_LONGER_AVAILABLE | &quot;No longer available&quot;
NOT_YET_RECRUITING | &quot;Not yet recruiting&quot;
RECRUITING | &quot;Recruiting&quot;
SUSPENDED | &quot;Suspended&quot;
TEMPORARILY_NOT_AVAILABLE | &quot;Temporarily not available&quot;
TERMINATED | &quot;Terminated&quot;
WITHDRAWN | &quot;Withdrawn&quot;
WITHHELD | &quot;Withheld&quot;
UNKNOWN_STATUS | &quot;Unknown status&quot;

<a name="PhaseEnum"></a>
## Enum: PhaseEnum
Name | Value
---- | -----
N_A | &quot;N/A&quot;
EARLY_PHASE_1 | &quot;Early Phase 1&quot;
PHASE_1 | &quot;Phase 1&quot;
PHASE_1_PHASE_2 | &quot;Phase 1/Phase 2&quot;
PHASE_2 | &quot;Phase 2&quot;
PHASE_2_PHASE_3 | &quot;Phase 2/Phase 3&quot;
PHASE_3 | &quot;Phase 3&quot;
PHASE_4 | &quot;Phase 4&quot;

<a name="StudyTypeEnum"></a>
## Enum: StudyTypeEnum
Name | Value
---- | -----
EXPANDED_ACCESS | &quot;Expanded Access&quot;
INTERVENTIONAL | &quot;Interventional&quot;
N_A | &quot;N/A&quot;
OBSERVATIONAL | &quot;Observational&quot;
OBSERVATIONAL_PATIENT_REGISTRY_ | &quot;Observational [Patient Registry]&quot;

<a name="BiospecRetentionEnum"></a>
## Enum: BiospecRetentionEnum
Name | Value
---- | -----
NONE_RETAINED | &quot;None Retained&quot;
SAMPLES_WITH_DNA | &quot;Samples With DNA&quot;
SAMPLES_WITHOUT_DNA | &quot;Samples Without DNA&quot;
