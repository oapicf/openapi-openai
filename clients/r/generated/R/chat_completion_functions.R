#' Create a new ChatCompletionFunctions
#'
#' @description
#' ChatCompletionFunctions Class
#'
#' @docType class
#' @title ChatCompletionFunctions
#' @description ChatCompletionFunctions Class
#' @format An \code{R6Class} generator object
#' @field description A description of what the function does, used by the model to choose when and how to call the function. character [optional]
#' @field name The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64. character
#' @field parameters The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.   Omitting `parameters` defines a function with an empty parameter list. named list(\link{AnyType}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ChatCompletionFunctions <- R6::R6Class(
  "ChatCompletionFunctions",
  public = list(
    `description` = NULL,
    `name` = NULL,
    `parameters` = NULL,

    #' @description
    #' Initialize a new ChatCompletionFunctions class.
    #'
    #' @param name The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.
    #' @param description A description of what the function does, used by the model to choose when and how to call the function.
    #' @param parameters The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.   Omitting `parameters` defines a function with an empty parameter list.
    #' @param ... Other optional arguments.
    initialize = function(`name`, `description` = NULL, `parameters` = NULL, ...) {
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
      if (!is.null(`parameters`)) {
        stopifnot(is.vector(`parameters`), length(`parameters`) != 0)
        sapply(`parameters`, function(x) stopifnot(R6::is.R6(x)))
        self$`parameters` <- `parameters`
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
    #' @return ChatCompletionFunctions as a base R list.
    #' @examples
    #' # convert array of ChatCompletionFunctions (x) to a data frame
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
    #' Convert ChatCompletionFunctions to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ChatCompletionFunctionsObject <- list()
      if (!is.null(self$`description`)) {
        ChatCompletionFunctionsObject[["description"]] <-
          self$`description`
      }
      if (!is.null(self$`name`)) {
        ChatCompletionFunctionsObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`parameters`)) {
        ChatCompletionFunctionsObject[["parameters"]] <-
          lapply(self$`parameters`, function(x) x$toSimpleType())
      }
      return(ChatCompletionFunctionsObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ChatCompletionFunctions
    #'
    #' @param input_json the JSON input
    #' @return the instance of ChatCompletionFunctions
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`description`)) {
        self$`description` <- this_object$`description`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`parameters`)) {
        self$`parameters` <- ApiClient$new()$deserializeObj(this_object$`parameters`, "map(AnyType)", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ChatCompletionFunctions in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ChatCompletionFunctions
    #'
    #' @param input_json the JSON input
    #' @return the instance of ChatCompletionFunctions
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`description` <- this_object$`description`
      self$`name` <- this_object$`name`
      self$`parameters` <- ApiClient$new()$deserializeObj(this_object$`parameters`, "map(AnyType)", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to ChatCompletionFunctions and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for ChatCompletionFunctions: the required field `name` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ChatCompletionFunctions
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
# ChatCompletionFunctions$unlock()
#
## Below is an example to define the print function
# ChatCompletionFunctions$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ChatCompletionFunctions$lock()

