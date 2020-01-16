# Institution

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | unique identifier. |  [optional]
**name** | **String** | The name of the institution. | 
**country** | **String** | The ISO-3166 2 character country code where the institution is located. | 
**address** | **String** | Number and street portion of the address of the institution. |  [optional]
**subDivision** | **String** | State/Province portion of the address of the institution. |  [optional]
**city** | **String** | City portion of the address of the institution. |  [optional]
**postalCode** | **String** | Postal code portion of the address of the institution. | 
**idn** | **String** | The Integrated Delivery Network (IDN) for this institution.  Provide an id of another institution that is recognized by MoleculatMatch. |  [optional]
**synonyms** | **java.util.List&lt;String&gt;** | Alternative names the institution is referred by. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Indication of its level of readiness and incorporation into the MolecularMatch Knowledge base. |  [optional]
**test** | **Boolean** | A flag to mark test institutions. |  [optional]
**expirationDate** | [**OffsetDateTime**](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) | The institution will auto delete on this date.  Only used for institutions marked as test. |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
RECEIVED | &quot;received&quot;
IN_PROCESS | &quot;in-process&quot;
REGISTERED | &quot;registered&quot;
