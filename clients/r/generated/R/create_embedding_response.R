#' Create a new CreateEmbeddingResponse
#'
#' @description
#' CreateEmbeddingResponse Class
#'
#' @docType class
#' @title CreateEmbeddingResponse
#' @description CreateEmbeddingResponse Class
#' @format An \code{R6Class} generator object
#' @field object  character
#' @field model  character
#' @field data  list(\link{CreateEmbeddingResponseDataInner})
#' @field usage  \link{CreateEmbeddingResponseUsage}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateEmbeddingResponse <- R6::R6Class(
  "CreateEmbeddingResponse",
  public = list(
    `object` = NULL,
    `model` = NULL,
    `data` = NULL,
    `usage` = NULL,
    #' Initialize a new CreateEmbeddingResponse class.
    #'
    #' @description
    #' Initialize a new CreateEmbeddingResponse class.
    #'
    #' @param object object
    #' @param model model
    #' @param data data
    #' @param usage usage
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`object`, `model`, `data`, `usage`, ...) {
      if (!missing(`object`)) {
        if (!(is.character(`object`) && length(`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", `object`))
        }
        self$`object` <- `object`
      }
      if (!missing(`model`)) {
        if (!(is.character(`model`) && length(`model`) == 1)) {
          stop(paste("Error! Invalid data for `model`. Must be a string:", `model`))
        }
        self$`model` <- `model`
      }
      if (!missing(`data`)) {
        stopifnot(is.vector(`data`), length(`data`) != 0)
        sapply(`data`, function(x) stopifnot(R6::is.R6(x)))
        self$`data` <- `data`
      }
      if (!missing(`usage`)) {
        stopifnot(R6::is.R6(`usage`))
        self$`usage` <- `usage`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CreateEmbeddingResponse in JSON format
    #' @export
    toJSON = function() {
      CreateEmbeddingResponseObject <- list()
      if (!is.null(self$`object`)) {
        CreateEmbeddingResponseObject[["object"]] <-
          self$`object`
      }
      if (!is.null(self$`model`)) {
        CreateEmbeddingResponseObject[["model"]] <-
          self$`model`
      }
      if (!is.null(self$`data`)) {
        CreateEmbeddingResponseObject[["data"]] <-
          lapply(self$`data`, function(x) x$toJSON())
      }
      if (!is.null(self$`usage`)) {
        CreateEmbeddingResponseObject[["usage"]] <-
          self$`usage`$toJSON()
      }
      CreateEmbeddingResponseObject
    },
    #' Deserialize JSON string into an instance of CreateEmbeddingResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateEmbeddingResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateEmbeddingResponse
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`object`)) {
        self$`object` <- this_object$`object`
      }
      if (!is.null(this_object$`model`)) {
        self$`model` <- this_object$`model`
      }
      if (!is.null(this_object$`data`)) {
        self$`data` <- ApiClient$new()$deserializeObj(this_object$`data`, "array[CreateEmbeddingResponseDataInner]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`usage`)) {
        `usage_object` <- CreateEmbeddingResponseUsage$new()
        `usage_object`$fromJSON(jsonlite::toJSON(this_object$`usage`, auto_unbox = TRUE, digits = NA))
        self$`usage` <- `usage_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CreateEmbeddingResponse in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`object`)) {
          sprintf(
          '"object":
            "%s"
                    ',
          self$`object`
          )
        },
        if (!is.null(self$`model`)) {
          sprintf(
          '"model":
            "%s"
                    ',
          self$`model`
          )
        },
        if (!is.null(self$`data`)) {
          sprintf(
          '"data":
          [%s]
',
          paste(sapply(self$`data`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`usage`)) {
          sprintf(
          '"usage":
          %s
          ',
          jsonlite::toJSON(self$`usage`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CreateEmbeddingResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateEmbeddingResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateEmbeddingResponse
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`object` <- this_object$`object`
      self$`model` <- this_object$`model`
      self$`data` <- ApiClient$new()$deserializeObj(this_object$`data`, "array[CreateEmbeddingResponseDataInner]", loadNamespace("openapi"))
      self$`usage` <- CreateEmbeddingResponseUsage$new()$fromJSON(jsonlite::toJSON(this_object$`usage`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to CreateEmbeddingResponse
    #'
    #' @description
    #' Validate JSON input with respect to CreateEmbeddingResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `object`
      if (!is.null(input_json$`object`)) {
        if (!(is.character(input_json$`object`) && length(input_json$`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", input_json$`object`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateEmbeddingResponse: the required field `object` is missing."))
      }
      # check the required field `model`
      if (!is.null(input_json$`model`)) {
        if (!(is.character(input_json$`model`) && length(input_json$`model`) == 1)) {
          stop(paste("Error! Invalid data for `model`. Must be a string:", input_json$`model`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateEmbeddingResponse: the required field `model` is missing."))
      }
      # check the required field `data`
      if (!is.null(input_json$`data`)) {
        stopifnot(is.vector(input_json$`data`), length(input_json$`data`) != 0)
        tmp <- sapply(input_json$`data`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateEmbeddingResponse: the required field `data` is missing."))
      }
      # check the required field `usage`
      if (!is.null(input_json$`usage`)) {
        stopifnot(R6::is.R6(input_json$`usage`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateEmbeddingResponse: the required field `usage` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateEmbeddingResponse
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
      # check if the required `object` is null
      if (is.null(self$`object`)) {
        return(FALSE)
      }

      # check if the required `model` is null
      if (is.null(self$`model`)) {
        return(FALSE)
      }

      # check if the required `data` is null
      if (is.null(self$`data`)) {
        return(FALSE)
      }

      # check if the required `usage` is null
      if (is.null(self$`usage`)) {
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
      # check if the required `object` is null
      if (is.null(self$`object`)) {
        invalid_fields["object"] <- "Non-nullable required field `object` cannot be null."
      }

      # check if the required `model` is null
      if (is.null(self$`model`)) {
        invalid_fields["model"] <- "Non-nullable required field `model` cannot be null."
      }

      # check if the required `data` is null
      if (is.null(self$`data`)) {
        invalid_fields["data"] <- "Non-nullable required field `data` cannot be null."
      }

      # check if the required `usage` is null
      if (is.null(self$`usage`)) {
        invalid_fields["usage"] <- "Non-nullable required field `usage` cannot be null."
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
# CreateEmbeddingResponse$unlock()
#
## Below is an example to define the print function
# CreateEmbeddingResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateEmbeddingResponse$lock()

