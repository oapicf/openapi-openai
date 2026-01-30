# users_api

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DeleteUser**](users_api.md#DeleteUser) | **DELETE** /organization/users/{user_id} | Deletes a user from the organization.
[**ListUsers**](users_api.md#ListUsers) | **GET** /organization/users | Lists all of the users in the organization.
[**ModifyUser**](users_api.md#ModifyUser) | **POST** /organization/users/{user_id} | Modifies a user&#39;s role in the organization.
[**RetrieveUser**](users_api.md#RetrieveUser) | **GET** /organization/users/{user_id} | Retrieves a user by their identifier.


<a name="DeleteUser"></a>
# **DeleteUser**
> UserDeleteResponse DeleteUser(userId)

Deletes a user from the organization.
<a name="ListUsers"></a>
# **ListUsers**
> UserListResponse ListUsers(limit, after)

Lists all of the users in the organization.
<a name="ModifyUser"></a>
# **ModifyUser**
> User ModifyUser(userId, userRoleUpdateRequest)

Modifies a user&#39;s role in the organization.
<a name="RetrieveUser"></a>
# **RetrieveUser**
> User RetrieveUser(userId)

Retrieves a user by their identifier.
