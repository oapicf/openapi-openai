# Org.OpenAPITools - Azure Functions v4 Server

The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.

## Run

Linux/OS X:

```
sh build.sh
```

Windows:

```
build.bat
```
## Run in Docker

```
cd src/Org.OpenAPITools
docker build -t org.openapitools .
docker run -p 5000:8080 org.openapitools
```
