# Go API Server for openapi

The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

## Overview
This server was generated by the [openapi-generator]
(https://openapi-generator.tech) project.
By using the [OpenAPI-Spec](https://github.com/OAI/OpenAPI-Specification) from a remote server, you can easily generate a server stub.
-

To see how to make this your own, look here:

[README](https://openapi-generator.tech)

- API version: 2.0.0
- Build date: 2024-04-14T13:33:01.438185376Z[Etc/UTC]
- Generator version: 7.4.0
For more information, please visit [https://github.com/oapicf/openapi-openai](https://github.com/oapicf/openapi-openai)


### Running the server
To run the server, follow these simple steps:

```
go run main.go
```

To run the server in a docker container
```
docker build --network=host -t openapi .
```

Once image is built use
```
docker run --rm -it openapi
```
