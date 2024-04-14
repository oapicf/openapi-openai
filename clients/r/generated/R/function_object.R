#' Create a new FunctionObject
#'
#' @description
#' FunctionObject Class
#'
#' @docType class
#' @title FunctionObject
#' @description FunctionObject Class
#' @format An \code{R6Class} generator object
#' @field description A description of what the function does, used by the model to choose when and how to call the function. character [optional]
#' @field name The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64. character
#' @field parameters The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/text-generation/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.   Omitting `parameters` defines a function with an empty parameter list. named list(\link{AnyType}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FunctionObject <- R6::R6Class(
  "FunctionObject",
  public = list(
    `description` = NULL,
    `name` = NULL,
    `parameters` = NULL,
    #' Initialize a new FunctionObject class.
    #'
    #' @description
    #' Initialize a new FunctionObject class.
    #'
    #' @param name The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.
    #' @param description A description of what the function does, used by the model to choose when and how to call the function.
    #' @param parameters The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/text-generation/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.   Omitting `parameters` defines a function with an empty parameter list.
    #' @param ... Other optional arguments.
    #' @export
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
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FunctionObject in JSON format
    #' @export
    toJSON = function() {
      FunctionObjectObject <- list()
      if (!is.null(self$`description`)) {
        FunctionObjectObject[["description"]] <-
          self$`description`
      }
      if (!is.null(self$`name`)) {
        FunctionObjectObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`parameters`)) {
        FunctionObjectObject[["parameters"]] <-
          lapply(self$`parameters`, function(x) x$toJSON())
      }
      FunctionObjectObject
    },
    #' Deserialize JSON string into an instance of FunctionObject
    #'
    #' @description
    #' Deserialize JSON string into an instance of FunctionObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of FunctionObject
    #' @export
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
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FunctionObject in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`description`)) {
          sprintf(
          '"description":
            "%s"
                    ',
          self$`description`
          )
        },
        if (!is.null(self$`name`)) {
          sprintf(
          '"name":
            "%s"
                    ',
          self$`name`
          )
        },
        if (!is.null(self$`parameters`)) {
          sprintf(
          '"parameters":
          %s
',
          jsonlite::toJSON(lapply(self$`parameters`, function(x){ x$toJSON() }), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of FunctionObject
    #'
    #' @description
    #' Deserialize JSON string into an instance of FunctionObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of FunctionObject
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`description` <- this_object$`description`
      self$`name` <- this_object$`name`
      self$`parameters` <- ApiClient$new()$deserializeObj(this_object$`parameters`, "map(AnyType)", loadNamespace("openapi"))
      self
    },
    #' Validate JSON input with respect to FunctionObject
    #'
    #' @description
    #' Validate JSON input with respect to FunctionObject and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for FunctionObject: the required field `name` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of FunctionObject
    #' @export
    toString = function() {
      self$toJSONString()
    },
    #' Return true if the values in all fields are valid.
    #'
    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    #' @export
    isValid = function() {
      # check if the required `name` is null
      if (is.null(self$`name`)) {
        return(FALSE)
      }

      TRUE
    },
    #' Return a list of invalid fields (if any).
    #'
    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    #' @export
    getInvalidFields = function() {
      invalid_fields <- list()
      # check if the required `name` is null
      if (is.null(self$`name`)) {
        invalid_fields["name"] <- "Non-nullable required field `name` cannot be null."
      }

      invalid_fields
    },
    #' Print the object
    #'
    #' @description
    #' Print the object
    #'
    #' @export
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# FunctionObject$unlock()
#
## Below is an example to define the print function
# FunctionObject$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# FunctionObject$lock()

