#' Create a new DeleteMessageResponse
#'
#' @description
#' DeleteMessageResponse Class
#'
#' @docType class
#' @title DeleteMessageResponse
#' @description DeleteMessageResponse Class
#' @format An \code{R6Class} generator object
#' @field id  character
#' @field deleted  character
#' @field object  character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
DeleteMessageResponse <- R6::R6Class(
  "DeleteMessageResponse",
  public = list(
    `id` = NULL,
    `deleted` = NULL,
    `object` = NULL,
    #' Initialize a new DeleteMessageResponse class.
    #'
    #' @description
    #' Initialize a new DeleteMessageResponse class.
    #'
    #' @param id id
    #' @param deleted deleted
    #' @param object object
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`id`, `deleted`, `object`, ...) {
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`deleted`)) {
        if (!(is.logical(`deleted`) && length(`deleted`) == 1)) {
          stop(paste("Error! Invalid data for `deleted`. Must be a boolean:", `deleted`))
        }
        self$`deleted` <- `deleted`
      }
      if (!missing(`object`)) {
        if (!(`object` %in% c("thread.message.deleted"))) {
          stop(paste("Error! \"", `object`, "\" cannot be assigned to `object`. Must be \"thread.message.deleted\".", sep = ""))
        }
        if (!(is.character(`object`) && length(`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", `object`))
        }
        self$`object` <- `object`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return DeleteMessageResponse in JSON format
    #' @export
    toJSON = function() {
      DeleteMessageResponseObject <- list()
      if (!is.null(self$`id`)) {
        DeleteMessageResponseObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`deleted`)) {
        DeleteMessageResponseObject[["deleted"]] <-
          self$`deleted`
      }
      if (!is.null(self$`object`)) {
        DeleteMessageResponseObject[["object"]] <-
          self$`object`
      }
      DeleteMessageResponseObject
    },
    #' Deserialize JSON string into an instance of DeleteMessageResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of DeleteMessageResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of DeleteMessageResponse
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`deleted`)) {
        self$`deleted` <- this_object$`deleted`
      }
      if (!is.null(this_object$`object`)) {
        if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("thread.message.deleted"))) {
          stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"thread.message.deleted\".", sep = ""))
        }
        self$`object` <- this_object$`object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return DeleteMessageResponse in JSON format
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
        if (!is.null(self$`deleted`)) {
          sprintf(
          '"deleted":
            %s
                    ',
          tolower(self$`deleted`)
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
    #' Deserialize JSON string into an instance of DeleteMessageResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of DeleteMessageResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of DeleteMessageResponse
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`deleted` <- this_object$`deleted`
      if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("thread.message.deleted"))) {
        stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"thread.message.deleted\".", sep = ""))
      }
      self$`object` <- this_object$`object`
      self
    },
    #' Validate JSON input with respect to DeleteMessageResponse
    #'
    #' @description
    #' Validate JSON input with respect to DeleteMessageResponse and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for DeleteMessageResponse: the required field `id` is missing."))
      }
      # check the required field `deleted`
      if (!is.null(input_json$`deleted`)) {
        if (!(is.logical(input_json$`deleted`) && length(input_json$`deleted`) == 1)) {
          stop(paste("Error! Invalid data for `deleted`. Must be a boolean:", input_json$`deleted`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for DeleteMessageResponse: the required field `deleted` is missing."))
      }
      # check the required field `object`
      if (!is.null(input_json$`object`)) {
        if (!(is.character(input_json$`object`) && length(input_json$`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", input_json$`object`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for DeleteMessageResponse: the required field `object` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of DeleteMessageResponse
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

      # check if the required `deleted` is null
      if (is.null(self$`deleted`)) {
        return(FALSE)
      }

      # check if the required `object` is null
      if (is.null(self$`object`)) {
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

      # check if the required `deleted` is null
      if (is.null(self$`deleted`)) {
        invalid_fields["deleted"] <- "Non-nullable required field `deleted` cannot be null."
      }

      # check if the required `object` is null
      if (is.null(self$`object`)) {
        invalid_fields["object"] <- "Non-nullable required field `object` cannot be null."
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
# DeleteMessageResponse$unlock()
#
## Below is an example to define the print function
# DeleteMessageResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# DeleteMessageResponse$lock()

