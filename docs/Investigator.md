# Investigator

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**firstName** | **String** | First name of the investigator. |  [optional]
**middleName** | **String** | Middle name of the investigator. |  [optional]
**lastName** | **String** | Last name of the investigator. | 
**degrees** | **String** | Degress earned by the investigator. |  [optional]
**role** | [**RoleEnum**](#RoleEnum) | Position or function of the official. |  [optional]
**affiliation** | **String** | Full name of the official&#x27;s organization. |  [optional]
**phone** | **String** | Phone number of the investigator. |  [optional]
**phoneExt** | **String** | Phone number extension of the investigator. |  [optional]
**email** | **String** | Electronic mail address of the investigator. |  [optional]

<a name="RoleEnum"></a>
## Enum: RoleEnum
Name | Value
---- | -----
PRINCIPAL_INVESTIGATOR | &quot;Principal Investigator&quot;
SUB_INVESTIGATOR | &quot;Sub-Investigator&quot;
STUDY_CHAIR | &quot;Study Chair&quot;
STUDY_DIRECTOR | &quot;Study Director&quot;
