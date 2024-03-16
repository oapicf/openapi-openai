#' Create a new Model
#'
#' @description
#' Model Class
#'
#' @docType class
#' @title Model
#' @description Model Class
#' @format An \code{R6Class} generator object
#' @field id  character
#' @field object  character
#' @field created  integer
#' @field owned_by  character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Model <- R6::R6Class(
  "Model",
  public = list(
    `id` = NULL,
    `object` = NULL,
    `created` = NULL,
    `owned_by` = NULL,
    #' Initialize a new Model class.
    #'
    #' @description
    #' Initialize a new Model class.
    #'
    #' @param id id
    #' @param object object
    #' @param created created
    #' @param owned_by owned_by
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`id`, `object`, `created`, `owned_by`, ...) {
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
      if (!missing(`owned_by`)) {
        if (!(is.character(`owned_by`) && length(`owned_by`) == 1)) {
          stop(paste("Error! Invalid data for `owned_by`. Must be a string:", `owned_by`))
        }
        self$`owned_by` <- `owned_by`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return Model in JSON format
    #' @export
    toJSON = function() {
      ModelObject <- list()
      if (!is.null(self$`id`)) {
        ModelObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`object`)) {
        ModelObject[["object"]] <-
          self$`object`
      }
      if (!is.null(self$`created`)) {
        ModelObject[["created"]] <-
          self$`created`
      }
      if (!is.null(self$`owned_by`)) {
        ModelObject[["owned_by"]] <-
          self$`owned_by`
      }
      ModelObject
    },
    #' Deserialize JSON string into an instance of Model
    #'
    #' @description
    #' Deserialize JSON string into an instance of Model
    #'
    #' @param input_json the JSON input
    #' @return the instance of Model
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
      if (!is.null(this_object$`owned_by`)) {
        self$`owned_by` <- this_object$`owned_by`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return Model in JSON format
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
        if (!is.null(self$`owned_by`)) {
          sprintf(
          '"owned_by":
            "%s"
                    ',
          self$`owned_by`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of Model
    #'
    #' @description
    #' Deserialize JSON string into an instance of Model
    #'
    #' @param input_json the JSON input
    #' @return the instance of Model
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`object` <- this_object$`object`
      self$`created` <- this_object$`created`
      self$`owned_by` <- this_object$`owned_by`
      self
    },
    #' Validate JSON input with respect to Model
    #'
    #' @description
    #' Validate JSON input with respect to Model and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for Model: the required field `id` is missing."))
      }
      # check the required field `object`
      if (!is.null(input_json$`object`)) {
        if (!(is.character(input_json$`object`) && length(input_json$`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", input_json$`object`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Model: the required field `object` is missing."))
      }
      # check the required field `created`
      if (!is.null(input_json$`created`)) {
        if (!(is.numeric(input_json$`created`) && length(input_json$`created`) == 1)) {
          stop(paste("Error! Invalid data for `created`. Must be an integer:", input_json$`created`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Model: the required field `created` is missing."))
      }
      # check the required field `owned_by`
      if (!is.null(input_json$`owned_by`)) {
        if (!(is.character(input_json$`owned_by`) && length(input_json$`owned_by`) == 1)) {
          stop(paste("Error! Invalid data for `owned_by`. Must be a string:", input_json$`owned_by`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Model: the required field `owned_by` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of Model
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

      # check if the required `owned_by` is null
      if (is.null(self$`owned_by`)) {
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

      # check if the required `owned_by` is null
      if (is.null(self$`owned_by`)) {
        invalid_fields["owned_by"] <- "Non-nullable required field `owned_by` cannot be null."
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
# Model$unlock()
#
## Below is an example to define the print function
# Model$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# Model$lock()

