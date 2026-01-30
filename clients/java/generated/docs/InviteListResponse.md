

# InviteListResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**_object** | [**ObjectEnum**](#ObjectEnum) | The object type, which is always &#x60;list&#x60; |  |
|**data** | [**List&lt;Invite&gt;**](Invite.md) |  |  |
|**firstId** | **String** | The first &#x60;invite_id&#x60; in the retrieved &#x60;list&#x60; |  [optional] |
|**lastId** | **String** | The last &#x60;invite_id&#x60; in the retrieved &#x60;list&#x60; |  [optional] |
|**hasMore** | **Boolean** | The &#x60;has_more&#x60; property is used for pagination to indicate there are additional results. |  [optional] |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| LIST | &quot;list&quot; |



