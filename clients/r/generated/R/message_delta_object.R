#' Create a new MessageDeltaObject
#'
#' @description
#' Represents a message delta i.e. any changed fields on a message during streaming. 
#'
#' @docType class
#' @title MessageDeltaObject
#' @description MessageDeltaObject Class
#' @format An \code{R6Class} generator object
#' @field id The identifier of the message, which can be referenced in API endpoints. character
#' @field object The object type, which is always `thread.message.delta`. character
#' @field delta  \link{MessageDeltaObjectDelta}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MessageDeltaObject <- R6::R6Class(
  "MessageDeltaObject",
  public = list(
    `id` = NULL,
    `object` = NULL,
    `delta` = NULL,
    #' Initialize a new MessageDeltaObject class.
    #'
    #' @description
    #' Initialize a new MessageDeltaObject class.
    #'
    #' @param id The identifier of the message, which can be referenced in API endpoints.
    #' @param object The object type, which is always `thread.message.delta`.
    #' @param delta delta
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`id`, `object`, `delta`, ...) {
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`object`)) {
        if (!(`object` %in% c("thread.message.delta"))) {
          stop(paste("Error! \"", `object`, "\" cannot be assigned to `object`. Must be \"thread.message.delta\".", sep = ""))
        }
        if (!(is.character(`object`) && length(`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", `object`))
        }
        self$`object` <- `object`
      }
      if (!missing(`delta`)) {
        stopifnot(R6::is.R6(`delta`))
        self$`delta` <- `delta`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return MessageDeltaObject in JSON format
    #' @export
    toJSON = function() {
      MessageDeltaObjectObject <- list()
      if (!is.null(self$`id`)) {
        MessageDeltaObjectObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`object`)) {
        MessageDeltaObjectObject[["object"]] <-
          self$`object`
      }
      if (!is.null(self$`delta`)) {
        MessageDeltaObjectObject[["delta"]] <-
          self$`delta`$toJSON()
      }
      MessageDeltaObjectObject
    },
    #' Deserialize JSON string into an instance of MessageDeltaObject
    #'
    #' @description
    #' Deserialize JSON string into an instance of MessageDeltaObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of MessageDeltaObject
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`object`)) {
        if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("thread.message.delta"))) {
          stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"thread.message.delta\".", sep = ""))
        }
        self$`object` <- this_object$`object`
      }
      if (!is.null(this_object$`delta`)) {
        `delta_object` <- MessageDeltaObjectDelta$new()
        `delta_object`$fromJSON(jsonlite::toJSON(this_object$`delta`, auto_unbox = TRUE, digits = NA))
        self$`delta` <- `delta_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return MessageDeltaObject in JSON format
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
        if (!is.null(self$`delta`)) {
          sprintf(
          '"delta":
          %s
          ',
          jsonlite::toJSON(self$`delta`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of MessageDeltaObject
    #'
    #' @description
    #' Deserialize JSON string into an instance of MessageDeltaObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of MessageDeltaObject
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("thread.message.delta"))) {
        stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"thread.message.delta\".", sep = ""))
      }
      self$`object` <- this_object$`object`
      self$`delta` <- MessageDeltaObjectDelta$new()$fromJSON(jsonlite::toJSON(this_object$`delta`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to MessageDeltaObject
    #'
    #' @description
    #' Validate JSON input with respect to MessageDeltaObject and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for MessageDeltaObject: the required field `id` is missing."))
      }
      # check the required field `object`
      if (!is.null(input_json$`object`)) {
        if (!(is.character(input_json$`object`) && length(input_json$`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", input_json$`object`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MessageDeltaObject: the required field `object` is missing."))
      }
      # check the required field `delta`
      if (!is.null(input_json$`delta`)) {
        stopifnot(R6::is.R6(input_json$`delta`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MessageDeltaObject: the required field `delta` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of MessageDeltaObject
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

      # check if the required `delta` is null
      if (is.null(self$`delta`)) {
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

      # check if the required `delta` is null
      if (is.null(self$`delta`)) {
        invalid_fields["delta"] <- "Non-nullable required field `delta` cannot be null."
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
# MessageDeltaObject$unlock()
#
## Below is an example to define the print function
# MessageDeltaObject$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# MessageDeltaObject$lock()

