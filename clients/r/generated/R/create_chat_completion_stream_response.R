#' Create a new CreateChatCompletionStreamResponse
#'
#' @description
#' Represents a streamed chunk of a chat completion response returned by model, based on the provided input.
#'
#' @docType class
#' @title CreateChatCompletionStreamResponse
#' @description CreateChatCompletionStreamResponse Class
#' @format An \code{R6Class} generator object
#' @field id A unique identifier for the chat completion. Each chunk has the same ID. character
#' @field choices A list of chat completion choices. Can be more than one if `n` is greater than 1. list(\link{CreateChatCompletionStreamResponseChoicesInner})
#' @field created The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp. integer
#' @field model The model to generate the completion. character
#' @field system_fingerprint This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. character [optional]
#' @field object The object type, which is always `chat.completion.chunk`. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateChatCompletionStreamResponse <- R6::R6Class(
  "CreateChatCompletionStreamResponse",
  public = list(
    `id` = NULL,
    `choices` = NULL,
    `created` = NULL,
    `model` = NULL,
    `system_fingerprint` = NULL,
    `object` = NULL,

    #' @description
    #' Initialize a new CreateChatCompletionStreamResponse class.
    #'
    #' @param id A unique identifier for the chat completion. Each chunk has the same ID.
    #' @param choices A list of chat completion choices. Can be more than one if `n` is greater than 1.
    #' @param created The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp.
    #' @param model The model to generate the completion.
    #' @param object The object type, which is always `chat.completion.chunk`.
    #' @param system_fingerprint This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism.
    #' @param ... Other optional arguments.
    initialize = function(`id`, `choices`, `created`, `model`, `object`, `system_fingerprint` = NULL, ...) {
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`choices`)) {
        stopifnot(is.vector(`choices`), length(`choices`) != 0)
        sapply(`choices`, function(x) stopifnot(R6::is.R6(x)))
        self$`choices` <- `choices`
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
      if (!missing(`object`)) {
        if (!(`object` %in% c("chat.completion.chunk"))) {
          stop(paste("Error! \"", `object`, "\" cannot be assigned to `object`. Must be \"chat.completion.chunk\".", sep = ""))
        }
        if (!(is.character(`object`) && length(`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", `object`))
        }
        self$`object` <- `object`
      }
      if (!is.null(`system_fingerprint`)) {
        if (!(is.character(`system_fingerprint`) && length(`system_fingerprint`) == 1)) {
          stop(paste("Error! Invalid data for `system_fingerprint`. Must be a string:", `system_fingerprint`))
        }
        self$`system_fingerprint` <- `system_fingerprint`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return CreateChatCompletionStreamResponse in JSON format
    toJSON = function() {
      CreateChatCompletionStreamResponseObject <- list()
      if (!is.null(self$`id`)) {
        CreateChatCompletionStreamResponseObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`choices`)) {
        CreateChatCompletionStreamResponseObject[["choices"]] <-
          lapply(self$`choices`, function(x) x$toJSON())
      }
      if (!is.null(self$`created`)) {
        CreateChatCompletionStreamResponseObject[["created"]] <-
          self$`created`
      }
      if (!is.null(self$`model`)) {
        CreateChatCompletionStreamResponseObject[["model"]] <-
          self$`model`
      }
      if (!is.null(self$`system_fingerprint`)) {
        CreateChatCompletionStreamResponseObject[["system_fingerprint"]] <-
          self$`system_fingerprint`
      }
      if (!is.null(self$`object`)) {
        CreateChatCompletionStreamResponseObject[["object"]] <-
          self$`object`
      }
      CreateChatCompletionStreamResponseObject
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateChatCompletionStreamResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateChatCompletionStreamResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`choices`)) {
        self$`choices` <- ApiClient$new()$deserializeObj(this_object$`choices`, "array[CreateChatCompletionStreamResponseChoicesInner]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`created`)) {
        self$`created` <- this_object$`created`
      }
      if (!is.null(this_object$`model`)) {
        self$`model` <- this_object$`model`
      }
      if (!is.null(this_object$`system_fingerprint`)) {
        self$`system_fingerprint` <- this_object$`system_fingerprint`
      }
      if (!is.null(this_object$`object`)) {
        if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("chat.completion.chunk"))) {
          stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"chat.completion.chunk\".", sep = ""))
        }
        self$`object` <- this_object$`object`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return CreateChatCompletionStreamResponse in JSON format
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
        if (!is.null(self$`choices`)) {
          sprintf(
          '"choices":
          [%s]
',
          paste(sapply(self$`choices`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
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
        if (!is.null(self$`system_fingerprint`)) {
          sprintf(
          '"system_fingerprint":
            "%s"
                    ',
          self$`system_fingerprint`
          )
        },
        if (!is.null(self$`object`)) {
          sprintf(
          '"object":
            "%s"
                    ',
          self$`object`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateChatCompletionStreamResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateChatCompletionStreamResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`choices` <- ApiClient$new()$deserializeObj(this_object$`choices`, "array[CreateChatCompletionStreamResponseChoicesInner]", loadNamespace("openapi"))
      self$`created` <- this_object$`created`
      self$`model` <- this_object$`model`
      self$`system_fingerprint` <- this_object$`system_fingerprint`
      if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("chat.completion.chunk"))) {
        stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"chat.completion.chunk\".", sep = ""))
      }
      self$`object` <- this_object$`object`
      self
    },

    #' @description
    #' Validate JSON input with respect to CreateChatCompletionStreamResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
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
      # check the required field `choices`
      if (!is.null(input_json$`choices`)) {
        stopifnot(is.vector(input_json$`choices`), length(input_json$`choices`) != 0)
        tmp <- sapply(input_json$`choices`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateChatCompletionStreamResponse: the required field `choices` is missing."))
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
      # check the required field `object`
      if (!is.null(input_json$`object`)) {
        if (!(is.character(input_json$`object`) && length(input_json$`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", input_json$`object`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateChatCompletionStreamResponse: the required field `object` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateChatCompletionStreamResponse
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        return(FALSE)
      }

      # check if the required `choices` is null
      if (is.null(self$`choices`)) {
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

      # check if the required `object` is null
      if (is.null(self$`object`)) {
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
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
      }

      # check if the required `choices` is null
      if (is.null(self$`choices`)) {
        invalid_fields["choices"] <- "Non-nullable required field `choices` cannot be null."
      }

      # check if the required `created` is null
      if (is.null(self$`created`)) {
        invalid_fields["created"] <- "Non-nullable required field `created` cannot be null."
      }

      # check if the required `model` is null
      if (is.null(self$`model`)) {
        invalid_fields["model"] <- "Non-nullable required field `model` cannot be null."
      }

      # check if the required `object` is null
      if (is.null(self$`object`)) {
        invalid_fields["object"] <- "Non-nullable required field `object` cannot be null."
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
# CreateChatCompletionStreamResponse$unlock()
#
## Below is an example to define the print function
# CreateChatCompletionStreamResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateChatCompletionStreamResponse$lock()

