#' Create a new ResponseFormatJsonSchemaJsonSchema
#'
#' @description
#' ResponseFormatJsonSchemaJsonSchema Class
#'
#' @docType class
#' @title ResponseFormatJsonSchemaJsonSchema
#' @description ResponseFormatJsonSchemaJsonSchema Class
#' @format An \code{R6Class} generator object
#' @field description A description of what the response format is for, used by the model to determine how to respond in the format. character [optional]
#' @field name The name of the response format. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64. character
#' @field schema The schema for the response format, described as a JSON Schema object. named list(\link{AnyType}) [optional]
#' @field strict Whether to enable strict schema adherence when generating the output. If set to true, the model will always follow the exact schema defined in the `schema` field. Only a subset of JSON Schema is supported when `strict` is `true`. To learn more, read the [Structured Outputs guide](/docs/guides/structured-outputs). character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ResponseFormatJsonSchemaJsonSchema <- R6::R6Class(
  "ResponseFormatJsonSchemaJsonSchema",
  public = list(
    `description` = NULL,
    `name` = NULL,
    `schema` = NULL,
    `strict` = NULL,

    #' @description
    #' Initialize a new ResponseFormatJsonSchemaJsonSchema class.
    #'
    #' @param name The name of the response format. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.
    #' @param description A description of what the response format is for, used by the model to determine how to respond in the format.
    #' @param schema The schema for the response format, described as a JSON Schema object.
    #' @param strict Whether to enable strict schema adherence when generating the output. If set to true, the model will always follow the exact schema defined in the `schema` field. Only a subset of JSON Schema is supported when `strict` is `true`. To learn more, read the [Structured Outputs guide](/docs/guides/structured-outputs).. Default to FALSE.
    #' @param ... Other optional arguments.
    initialize = function(`name`, `description` = NULL, `schema` = NULL, `strict` = FALSE, ...) {
      if (!missing(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`description`)) {
        if (!(is.character(`description`) && length(`description`) == 1)) {
          stop(paste("Error! Invalid data for `description`. Must be a string:", `description`))
        }
        self$`description` <- `description`
      }
      if (!is.null(`schema`)) {
        stopifnot(is.vector(`schema`), length(`schema`) != 0)
        sapply(`schema`, function(x) stopifnot(R6::is.R6(x)))
        self$`schema` <- `schema`
      }
      if (!is.null(`strict`)) {
        if (!(is.logical(`strict`) && length(`strict`) == 1)) {
          stop(paste("Error! Invalid data for `strict`. Must be a boolean:", `strict`))
        }
        self$`strict` <- `strict`
      }
    },

    #' @description
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert to a List
    #'
    #' Convert the R6 object to a list to work more easily with other tooling.
    #'
    #' @return ResponseFormatJsonSchemaJsonSchema as a base R list.
    #' @examples
    #' # convert array of ResponseFormatJsonSchemaJsonSchema (x) to a data frame
    #' \dontrun{
    #' library(purrr)
    #' library(tibble)
    #' df <- x |> map(\(y)y$toList()) |> map(as_tibble) |> list_rbind()
    #' df
    #' }
    toList = function() {
      return(self$toSimpleType())
    },

    #' @description
    #' Convert ResponseFormatJsonSchemaJsonSchema to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ResponseFormatJsonSchemaJsonSchemaObject <- list()
      if (!is.null(self$`description`)) {
        ResponseFormatJsonSchemaJsonSchemaObject[["description"]] <-
          self$`description`
      }
      if (!is.null(self$`name`)) {
        ResponseFormatJsonSchemaJsonSchemaObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`schema`)) {
        ResponseFormatJsonSchemaJsonSchemaObject[["schema"]] <-
          lapply(self$`schema`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`strict`)) {
        ResponseFormatJsonSchemaJsonSchemaObject[["strict"]] <-
          self$`strict`
      }
      return(ResponseFormatJsonSchemaJsonSchemaObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ResponseFormatJsonSchemaJsonSchema
    #'
    #' @param input_json the JSON input
    #' @return the instance of ResponseFormatJsonSchemaJsonSchema
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`description`)) {
        self$`description` <- this_object$`description`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`schema`)) {
        self$`schema` <- ApiClient$new()$deserializeObj(this_object$`schema`, "map(AnyType)", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`strict`)) {
        self$`strict` <- this_object$`strict`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ResponseFormatJsonSchemaJsonSchema in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ResponseFormatJsonSchemaJsonSchema
    #'
    #' @param input_json the JSON input
    #' @return the instance of ResponseFormatJsonSchemaJsonSchema
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`description` <- this_object$`description`
      self$`name` <- this_object$`name`
      self$`schema` <- ApiClient$new()$deserializeObj(this_object$`schema`, "map(AnyType)", loadNamespace("openapi"))
      self$`strict` <- this_object$`strict`
      self
    },

    #' @description
    #' Validate JSON input with respect to ResponseFormatJsonSchemaJsonSchema and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ResponseFormatJsonSchemaJsonSchema: the required field `name` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ResponseFormatJsonSchemaJsonSchema
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `name` is null
      if (is.null(self$`name`)) {
        return(FALSE)
      }

      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
      # check if the required `name` is null
      if (is.null(self$`name`)) {
        invalid_fields["name"] <- "Non-nullable required field `name` cannot be null."
      }

      invalid_fields
    },

    #' @description
    #' Print the object
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# ResponseFormatJsonSchemaJsonSchema$unlock()
#
## Below is an example to define the print function
# ResponseFormatJsonSchemaJsonSchema$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ResponseFormatJsonSchemaJsonSchema$lock()

