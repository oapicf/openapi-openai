#' Create a new DeleteFileResponse
#'
#' @description
#' DeleteFileResponse Class
#'
#' @docType class
#' @title DeleteFileResponse
#' @description DeleteFileResponse Class
#' @format An \code{R6Class} generator object
#' @field id  character
#' @field object  character
#' @field deleted  character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
DeleteFileResponse <- R6::R6Class(
  "DeleteFileResponse",
  public = list(
    `id` = NULL,
    `object` = NULL,
    `deleted` = NULL,
    #' Initialize a new DeleteFileResponse class.
    #'
    #' @description
    #' Initialize a new DeleteFileResponse class.
    #'
    #' @param id id
    #' @param object object
    #' @param deleted deleted
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`id`, `object`, `deleted`, ...) {
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
      if (!missing(`deleted`)) {
        if (!(is.logical(`deleted`) && length(`deleted`) == 1)) {
          stop(paste("Error! Invalid data for `deleted`. Must be a boolean:", `deleted`))
        }
        self$`deleted` <- `deleted`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return DeleteFileResponse in JSON format
    #' @export
    toJSON = function() {
      DeleteFileResponseObject <- list()
      if (!is.null(self$`id`)) {
        DeleteFileResponseObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`object`)) {
        DeleteFileResponseObject[["object"]] <-
          self$`object`
      }
      if (!is.null(self$`deleted`)) {
        DeleteFileResponseObject[["deleted"]] <-
          self$`deleted`
      }
      DeleteFileResponseObject
    },
    #' Deserialize JSON string into an instance of DeleteFileResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of DeleteFileResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of DeleteFileResponse
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`object`)) {
        self$`object` <- this_object$`object`
      }
      if (!is.null(this_object$`deleted`)) {
        self$`deleted` <- this_object$`deleted`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return DeleteFileResponse in JSON format
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
        if (!is.null(self$`deleted`)) {
          sprintf(
          '"deleted":
            %s
                    ',
          tolower(self$`deleted`)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of DeleteFileResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of DeleteFileResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of DeleteFileResponse
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`object` <- this_object$`object`
      self$`deleted` <- this_object$`deleted`
      self
    },
    #' Validate JSON input with respect to DeleteFileResponse
    #'
    #' @description
    #' Validate JSON input with respect to DeleteFileResponse and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for DeleteFileResponse: the required field `id` is missing."))
      }
      # check the required field `object`
      if (!is.null(input_json$`object`)) {
        if (!(is.character(input_json$`object`) && length(input_json$`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", input_json$`object`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for DeleteFileResponse: the required field `object` is missing."))
      }
      # check the required field `deleted`
      if (!is.null(input_json$`deleted`)) {
        if (!(is.logical(input_json$`deleted`) && length(input_json$`deleted`) == 1)) {
          stop(paste("Error! Invalid data for `deleted`. Must be a boolean:", input_json$`deleted`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for DeleteFileResponse: the required field `deleted` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of DeleteFileResponse
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

      # check if the required `deleted` is null
      if (is.null(self$`deleted`)) {
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

      # check if the required `deleted` is null
      if (is.null(self$`deleted`)) {
        invalid_fields["deleted"] <- "Non-nullable required field `deleted` cannot be null."
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
# DeleteFileResponse$unlock()
#
## Below is an example to define the print function
# DeleteFileResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# DeleteFileResponse$lock()

