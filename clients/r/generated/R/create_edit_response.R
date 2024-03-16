#' Create a new CreateEditResponse
#'
#' @description
#' CreateEditResponse Class
#'
#' @docType class
#' @title CreateEditResponse
#' @description CreateEditResponse Class
#' @format An \code{R6Class} generator object
#' @field object  character
#' @field created  integer
#' @field choices  list(\link{CreateEditResponseChoicesInner})
#' @field usage  \link{CreateCompletionResponseUsage}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateEditResponse <- R6::R6Class(
  "CreateEditResponse",
  public = list(
    `object` = NULL,
    `created` = NULL,
    `choices` = NULL,
    `usage` = NULL,
    #' Initialize a new CreateEditResponse class.
    #'
    #' @description
    #' Initialize a new CreateEditResponse class.
    #'
    #' @param object object
    #' @param created created
    #' @param choices choices
    #' @param usage usage
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`object`, `created`, `choices`, `usage`, ...) {
      if (!missing(`object`)) {
        if (!(is.character(`object`) && length(`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", `object`))
        }
        self$`object` <- `object`
      }
      if (!missing(`created`)) {
        if (!(is.numeric(`created`) && length(`created`) == 1)) {
          stop(paste("Error! Invalid data for `created`. Must be an integer:", `created`))
        }
        self$`created` <- `created`
      }
      if (!missing(`choices`)) {
        stopifnot(is.vector(`choices`), length(`choices`) != 0)
        sapply(`choices`, function(x) stopifnot(R6::is.R6(x)))
        self$`choices` <- `choices`
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
    #' @return CreateEditResponse in JSON format
    #' @export
    toJSON = function() {
      CreateEditResponseObject <- list()
      if (!is.null(self$`object`)) {
        CreateEditResponseObject[["object"]] <-
          self$`object`
      }
      if (!is.null(self$`created`)) {
        CreateEditResponseObject[["created"]] <-
          self$`created`
      }
      if (!is.null(self$`choices`)) {
        CreateEditResponseObject[["choices"]] <-
          lapply(self$`choices`, function(x) x$toJSON())
      }
      if (!is.null(self$`usage`)) {
        CreateEditResponseObject[["usage"]] <-
          self$`usage`$toJSON()
      }
      CreateEditResponseObject
    },
    #' Deserialize JSON string into an instance of CreateEditResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateEditResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateEditResponse
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`object`)) {
        self$`object` <- this_object$`object`
      }
      if (!is.null(this_object$`created`)) {
        self$`created` <- this_object$`created`
      }
      if (!is.null(this_object$`choices`)) {
        self$`choices` <- ApiClient$new()$deserializeObj(this_object$`choices`, "array[CreateEditResponseChoicesInner]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`usage`)) {
        `usage_object` <- CreateCompletionResponseUsage$new()
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
    #' @return CreateEditResponse in JSON format
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
        if (!is.null(self$`created`)) {
          sprintf(
          '"created":
            %d
                    ',
          self$`created`
          )
        },
        if (!is.null(self$`choices`)) {
          sprintf(
          '"choices":
          [%s]
',
          paste(sapply(self$`choices`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
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
    #' Deserialize JSON string into an instance of CreateEditResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateEditResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateEditResponse
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`object` <- this_object$`object`
      self$`created` <- this_object$`created`
      self$`choices` <- ApiClient$new()$deserializeObj(this_object$`choices`, "array[CreateEditResponseChoicesInner]", loadNamespace("openapi"))
      self$`usage` <- CreateCompletionResponseUsage$new()$fromJSON(jsonlite::toJSON(this_object$`usage`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to CreateEditResponse
    #'
    #' @description
    #' Validate JSON input with respect to CreateEditResponse and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for CreateEditResponse: the required field `object` is missing."))
      }
      # check the required field `created`
      if (!is.null(input_json$`created`)) {
        if (!(is.numeric(input_json$`created`) && length(input_json$`created`) == 1)) {
          stop(paste("Error! Invalid data for `created`. Must be an integer:", input_json$`created`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateEditResponse: the required field `created` is missing."))
      }
      # check the required field `choices`
      if (!is.null(input_json$`choices`)) {
        stopifnot(is.vector(input_json$`choices`), length(input_json$`choices`) != 0)
        tmp <- sapply(input_json$`choices`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateEditResponse: the required field `choices` is missing."))
      }
      # check the required field `usage`
      if (!is.null(input_json$`usage`)) {
        stopifnot(R6::is.R6(input_json$`usage`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateEditResponse: the required field `usage` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateEditResponse
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

      # check if the required `created` is null
      if (is.null(self$`created`)) {
        return(FALSE)
      }

      # check if the required `choices` is null
      if (is.null(self$`choices`)) {
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

      # check if the required `created` is null
      if (is.null(self$`created`)) {
        invalid_fields["created"] <- "Non-nullable required field `created` cannot be null."
      }

      # check if the required `choices` is null
      if (is.null(self$`choices`)) {
        invalid_fields["choices"] <- "Non-nullable required field `choices` cannot be null."
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
# CreateEditResponse$unlock()
#
## Below is an example to define the print function
# CreateEditResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateEditResponse$lock()

