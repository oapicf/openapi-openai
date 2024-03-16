#' Create a new CreateCompletionResponse
#'
#' @description
#' CreateCompletionResponse Class
#'
#' @docType class
#' @title CreateCompletionResponse
#' @description CreateCompletionResponse Class
#' @format An \code{R6Class} generator object
#' @field id  character
#' @field object  character
#' @field created  integer
#' @field model  character
#' @field choices  list(\link{CreateCompletionResponseChoicesInner})
#' @field usage  \link{CreateCompletionResponseUsage} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateCompletionResponse <- R6::R6Class(
  "CreateCompletionResponse",
  public = list(
    `id` = NULL,
    `object` = NULL,
    `created` = NULL,
    `model` = NULL,
    `choices` = NULL,
    `usage` = NULL,
    #' Initialize a new CreateCompletionResponse class.
    #'
    #' @description
    #' Initialize a new CreateCompletionResponse class.
    #'
    #' @param id id
    #' @param object object
    #' @param created created
    #' @param model model
    #' @param choices choices
    #' @param usage usage
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`id`, `object`, `created`, `model`, `choices`, `usage` = NULL, ...) {
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
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
      if (!missing(`model`)) {
        if (!(is.character(`model`) && length(`model`) == 1)) {
          stop(paste("Error! Invalid data for `model`. Must be a string:", `model`))
        }
        self$`model` <- `model`
      }
      if (!missing(`choices`)) {
        stopifnot(is.vector(`choices`), length(`choices`) != 0)
        sapply(`choices`, function(x) stopifnot(R6::is.R6(x)))
        self$`choices` <- `choices`
      }
      if (!is.null(`usage`)) {
        stopifnot(R6::is.R6(`usage`))
        self$`usage` <- `usage`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CreateCompletionResponse in JSON format
    #' @export
    toJSON = function() {
      CreateCompletionResponseObject <- list()
      if (!is.null(self$`id`)) {
        CreateCompletionResponseObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`object`)) {
        CreateCompletionResponseObject[["object"]] <-
          self$`object`
      }
      if (!is.null(self$`created`)) {
        CreateCompletionResponseObject[["created"]] <-
          self$`created`
      }
      if (!is.null(self$`model`)) {
        CreateCompletionResponseObject[["model"]] <-
          self$`model`
      }
      if (!is.null(self$`choices`)) {
        CreateCompletionResponseObject[["choices"]] <-
          lapply(self$`choices`, function(x) x$toJSON())
      }
      if (!is.null(self$`usage`)) {
        CreateCompletionResponseObject[["usage"]] <-
          self$`usage`$toJSON()
      }
      CreateCompletionResponseObject
    },
    #' Deserialize JSON string into an instance of CreateCompletionResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateCompletionResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateCompletionResponse
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`object`)) {
        self$`object` <- this_object$`object`
      }
      if (!is.null(this_object$`created`)) {
        self$`created` <- this_object$`created`
      }
      if (!is.null(this_object$`model`)) {
        self$`model` <- this_object$`model`
      }
      if (!is.null(this_object$`choices`)) {
        self$`choices` <- ApiClient$new()$deserializeObj(this_object$`choices`, "array[CreateCompletionResponseChoicesInner]", loadNamespace("openapi"))
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
    #' @return CreateCompletionResponse in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`id`)) {
          sprintf(
          '"id":
            "%s"
                    ',
          self$`id`
          )
        },
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
        if (!is.null(self$`model`)) {
          sprintf(
          '"model":
            "%s"
                    ',
          self$`model`
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
    #' Deserialize JSON string into an instance of CreateCompletionResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateCompletionResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateCompletionResponse
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`object` <- this_object$`object`
      self$`created` <- this_object$`created`
      self$`model` <- this_object$`model`
      self$`choices` <- ApiClient$new()$deserializeObj(this_object$`choices`, "array[CreateCompletionResponseChoicesInner]", loadNamespace("openapi"))
      self$`usage` <- CreateCompletionResponseUsage$new()$fromJSON(jsonlite::toJSON(this_object$`usage`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to CreateCompletionResponse
    #'
    #' @description
    #' Validate JSON input with respect to CreateCompletionResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.character(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateCompletionResponse: the required field `id` is missing."))
      }
      # check the required field `object`
      if (!is.null(input_json$`object`)) {
        if (!(is.character(input_json$`object`) && length(input_json$`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", input_json$`object`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateCompletionResponse: the required field `object` is missing."))
      }
      # check the required field `created`
      if (!is.null(input_json$`created`)) {
        if (!(is.numeric(input_json$`created`) && length(input_json$`created`) == 1)) {
          stop(paste("Error! Invalid data for `created`. Must be an integer:", input_json$`created`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateCompletionResponse: the required field `created` is missing."))
      }
      # check the required field `model`
      if (!is.null(input_json$`model`)) {
        if (!(is.character(input_json$`model`) && length(input_json$`model`) == 1)) {
          stop(paste("Error! Invalid data for `model`. Must be a string:", input_json$`model`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateCompletionResponse: the required field `model` is missing."))
      }
      # check the required field `choices`
      if (!is.null(input_json$`choices`)) {
        stopifnot(is.vector(input_json$`choices`), length(input_json$`choices`) != 0)
        tmp <- sapply(input_json$`choices`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateCompletionResponse: the required field `choices` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateCompletionResponse
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
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        return(FALSE)
      }

      # check if the required `object` is null
      if (is.null(self$`object`)) {
        return(FALSE)
      }

      # check if the required `created` is null
      if (is.null(self$`created`)) {
        return(FALSE)
      }

      # check if the required `model` is null
      if (is.null(self$`model`)) {
        return(FALSE)
      }

      # check if the required `choices` is null
      if (is.null(self$`choices`)) {
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
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
      }

      # check if the required `object` is null
      if (is.null(self$`object`)) {
        invalid_fields["object"] <- "Non-nullable required field `object` cannot be null."
      }

      # check if the required `created` is null
      if (is.null(self$`created`)) {
        invalid_fields["created"] <- "Non-nullable required field `created` cannot be null."
      }

      # check if the required `model` is null
      if (is.null(self$`model`)) {
        invalid_fields["model"] <- "Non-nullable required field `model` cannot be null."
      }

      # check if the required `choices` is null
      if (is.null(self$`choices`)) {
        invalid_fields["choices"] <- "Non-nullable required field `choices` cannot be null."
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
# CreateCompletionResponse$unlock()
#
## Below is an example to define the print function
# CreateCompletionResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateCompletionResponse$lock()

