#' Create a new MessageFileObject
#'
#' @description
#' A list of files attached to a `message`.
#'
#' @docType class
#' @title MessageFileObject
#' @description MessageFileObject Class
#' @format An \code{R6Class} generator object
#' @field id The identifier, which can be referenced in API endpoints. character
#' @field object The object type, which is always `thread.message.file`. character
#' @field created_at The Unix timestamp (in seconds) for when the message file was created. integer
#' @field message_id The ID of the [message](/docs/api-reference/messages) that the [File](/docs/api-reference/files) is attached to. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MessageFileObject <- R6::R6Class(
  "MessageFileObject",
  public = list(
    `id` = NULL,
    `object` = NULL,
    `created_at` = NULL,
    `message_id` = NULL,
    #' Initialize a new MessageFileObject class.
    #'
    #' @description
    #' Initialize a new MessageFileObject class.
    #'
    #' @param id The identifier, which can be referenced in API endpoints.
    #' @param object The object type, which is always `thread.message.file`.
    #' @param created_at The Unix timestamp (in seconds) for when the message file was created.
    #' @param message_id The ID of the [message](/docs/api-reference/messages) that the [File](/docs/api-reference/files) is attached to.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`id`, `object`, `created_at`, `message_id`, ...) {
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`object`)) {
        if (!(`object` %in% c("thread.message.file"))) {
          stop(paste("Error! \"", `object`, "\" cannot be assigned to `object`. Must be \"thread.message.file\".", sep = ""))
        }
        if (!(is.character(`object`) && length(`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", `object`))
        }
        self$`object` <- `object`
      }
      if (!missing(`created_at`)) {
        if (!(is.numeric(`created_at`) && length(`created_at`) == 1)) {
          stop(paste("Error! Invalid data for `created_at`. Must be an integer:", `created_at`))
        }
        self$`created_at` <- `created_at`
      }
      if (!missing(`message_id`)) {
        if (!(is.character(`message_id`) && length(`message_id`) == 1)) {
          stop(paste("Error! Invalid data for `message_id`. Must be a string:", `message_id`))
        }
        self$`message_id` <- `message_id`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return MessageFileObject in JSON format
    #' @export
    toJSON = function() {
      MessageFileObjectObject <- list()
      if (!is.null(self$`id`)) {
        MessageFileObjectObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`object`)) {
        MessageFileObjectObject[["object"]] <-
          self$`object`
      }
      if (!is.null(self$`created_at`)) {
        MessageFileObjectObject[["created_at"]] <-
          self$`created_at`
      }
      if (!is.null(self$`message_id`)) {
        MessageFileObjectObject[["message_id"]] <-
          self$`message_id`
      }
      MessageFileObjectObject
    },
    #' Deserialize JSON string into an instance of MessageFileObject
    #'
    #' @description
    #' Deserialize JSON string into an instance of MessageFileObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of MessageFileObject
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`object`)) {
        if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("thread.message.file"))) {
          stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"thread.message.file\".", sep = ""))
        }
        self$`object` <- this_object$`object`
      }
      if (!is.null(this_object$`created_at`)) {
        self$`created_at` <- this_object$`created_at`
      }
      if (!is.null(this_object$`message_id`)) {
        self$`message_id` <- this_object$`message_id`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return MessageFileObject in JSON format
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
        if (!is.null(self$`created_at`)) {
          sprintf(
          '"created_at":
            %d
                    ',
          self$`created_at`
          )
        },
        if (!is.null(self$`message_id`)) {
          sprintf(
          '"message_id":
            "%s"
                    ',
          self$`message_id`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of MessageFileObject
    #'
    #' @description
    #' Deserialize JSON string into an instance of MessageFileObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of MessageFileObject
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("thread.message.file"))) {
        stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"thread.message.file\".", sep = ""))
      }
      self$`object` <- this_object$`object`
      self$`created_at` <- this_object$`created_at`
      self$`message_id` <- this_object$`message_id`
      self
    },
    #' Validate JSON input with respect to MessageFileObject
    #'
    #' @description
    #' Validate JSON input with respect to MessageFileObject and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for MessageFileObject: the required field `id` is missing."))
      }
      # check the required field `object`
      if (!is.null(input_json$`object`)) {
        if (!(is.character(input_json$`object`) && length(input_json$`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", input_json$`object`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MessageFileObject: the required field `object` is missing."))
      }
      # check the required field `created_at`
      if (!is.null(input_json$`created_at`)) {
        if (!(is.numeric(input_json$`created_at`) && length(input_json$`created_at`) == 1)) {
          stop(paste("Error! Invalid data for `created_at`. Must be an integer:", input_json$`created_at`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MessageFileObject: the required field `created_at` is missing."))
      }
      # check the required field `message_id`
      if (!is.null(input_json$`message_id`)) {
        if (!(is.character(input_json$`message_id`) && length(input_json$`message_id`) == 1)) {
          stop(paste("Error! Invalid data for `message_id`. Must be a string:", input_json$`message_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MessageFileObject: the required field `message_id` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of MessageFileObject
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

      # check if the required `created_at` is null
      if (is.null(self$`created_at`)) {
        return(FALSE)
      }

      # check if the required `message_id` is null
      if (is.null(self$`message_id`)) {
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

      # check if the required `created_at` is null
      if (is.null(self$`created_at`)) {
        invalid_fields["created_at"] <- "Non-nullable required field `created_at` cannot be null."
      }

      # check if the required `message_id` is null
      if (is.null(self$`message_id`)) {
        invalid_fields["message_id"] <- "Non-nullable required field `message_id` cannot be null."
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
# MessageFileObject$unlock()
#
## Below is an example to define the print function
# MessageFileObject$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# MessageFileObject$lock()

