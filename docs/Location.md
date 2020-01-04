# Location

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**site** | [**Site**](Site.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Trial site recruiting status. | 
**contact** | [**Contact**](Contact.md) |  |  [optional]
**contactBackup** | [**Contact**](Contact.md) |  |  [optional]
**investigator** | [**java.util.List&lt;Investigator&gt;**](Investigator.md) | Person(s) responsible for the overall scientific leadership of the protocol, including study principal investigator. |  [optional]

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
