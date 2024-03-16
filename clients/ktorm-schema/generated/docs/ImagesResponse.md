
# Table `ImagesResponse`
(mapped from: ImagesResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**created** | created | int NOT NULL |  | **kotlin.Int** |  | 
**data** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ImagesResponseDataInner&gt;**](ImagesResponseDataInner.md) |  | 



# **Table `ImagesResponseImagesResponseDataInner`**
(mapped from: ImagesResponseImagesResponseDataInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
imagesResponse | imagesResponse | long | | kotlin.Long | Primary Key | *one*
imagesResponseDataInner | imagesResponseDataInner | long | | kotlin.Long | Foreign Key | *many*



