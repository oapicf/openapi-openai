
# Table `ImagesResponse`
(mapped from: ImagesResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**created** | created | int NOT NULL |  | **kotlin.Int** |  | 
**data** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;Image&gt;**](Image.md) |  | 



# **Table `ImagesResponseImage`**
(mapped from: ImagesResponseImage)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
imagesResponse | imagesResponse | long | | kotlin.Long | Primary Key | *one*
image | image | long | | kotlin.Long | Foreign Key | *many*



