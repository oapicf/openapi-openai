#' Create a new CreateChatCompletionStreamResponse
#'
#' @description
#' CreateChatCompletionStreamResponse Class
#'
#' @docType class
#' @title CreateChatCompletionStreamResponse
#' @description CreateChatCompletionStreamResponse Class
#' @format An \code{R6Class} generator object
#' @field id  character
#' @field object  character
#' @field created  integer
#' @field model  character
#' @field choices  list(\link{CreateChatCompletionStreamResponseChoicesInner})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateChatCompletionStreamResponse <- R6::R6Class(
  "CreateChatCompletionStreamResponse",
  public = list(
    `id` = NULL,
    `object` = NULL,
    `created` = NULL,
    `model` = NULL,
    `choices` = NULL,
    #' Initialize a new CreateChatCompletionStreamResponse class.
    #'
    #' @description
    #' Initialize a new CreateChatCompletionStreamResponse class.
    #'
    #' @param id id
    #' @param object object
    #' @param created created
    #' @param model model
    #' @param choices choices
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`id`, `object`, `created`, `model`, `choices`, ...) {
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
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CreateChatCompletionStreamResponse in JSON format
    #' @export
    toJSON = function() {
      CreateChatCompletionStreamResponseObject <- list()
      if (!is.null(self$`id`)) {
        CreateChatCompletionStreamResponseObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`object`)) {
        CreateChatCompletionStreamResponseObject[["object"]] <-
          self$`object`
      }
      if (!is.null(self$`created`)) {
        CreateChatCompletionStreamResponseObject[["created"]] <-
          self$`created`
      }
      if (!is.null(self$`model`)) {
        CreateChatCompletionStreamResponseObject[["model"]] <-
          self$`model`
      }
      if (!is.null(self$`choices`)) {
        CreateChatCompletionStreamResponseObject[["choices"]] <-
          lapply(self$`choices`, function(x) x$toJSON())
      }
      CreateChatCompletionStreamResponseObject
    },
    #' Deserialize JSON string into an instance of CreateChatCompletionStreamResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateChatCompletionStreamResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateChatCompletionStreamResponse
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
        self$`choices` <- ApiClient$new()$deserializeObj(this_object$`choices`, "array[CreateChatCompletionStreamResponseChoicesInner]", loadNamespace("openapi"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CreateChatCompletionStreamResponse in JSON format
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
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CreateChatCompletionStreamResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateChatCompletionStreamResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateChatCompletionStreamResponse
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`object` <- this_object$`object`
      self$`created` <- this_object$`created`
      self$`model` <- this_object$`model`
      self$`choices` <- ApiClient$new()$deserializeObj(this_object$`choices`, "array[CreateChatCompletionStreamResponseChoicesInner]", loadNamespace("openapi"))
      self
    },
    #' Validate JSON input with respect to CreateChatCompletionStreamResponse
    #'
    #' @description
    #' Validate JSON input with respect to CreateChatCompletionStreamResponse and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for CreateChatCompletionStreamResponse: the required field `id` is missing."))
      }
      # check the required field `object`
      if (!is.null(input_json$`object`)) {
        if (!(is.character(input_json$`object`) && length(input_json$`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", input_json$`object`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateChatCompletionStreamResponse: the required field `object` is missing."))
      }
      # check the required field `created`
      if (!is.null(input_json$`created`)) {
        if (!(is.numeric(input_json$`created`) && length(input_json$`created`) == 1)) {
          stop(paste("Error! Invalid data for `created`. Must be an integer:", input_json$`created`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateChatCompletionStreamResponse: the required field `created` is missing."))
      }
      # check the required field `model`
      if (!is.null(input_json$`model`)) {
        if (!(is.character(input_json$`model`) && length(input_json$`model`) == 1)) {
          stop(paste("Error! Invalid data for `model`. Must be a string:", input_json$`model`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateChatCompletionStreamResponse: the required field `model` is missing."))
      }
      # check the required field `choices`
      if (!is.null(input_json$`choices`)) {
        stopifnot(is.vector(input_json$`choices`), length(input_json$`choices`) != 0)
        tmp <- sapply(input_json$`choices`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateChatCompletionStreamResponse: the required field `choices` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateChatCompletionStreamResponse
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
# CreateChatCompletionStreamResponse$unlock()
#
## Below is an example to define the print function
# CreateChatCompletionStreamResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateChatCompletionStreamResponse$lock()

