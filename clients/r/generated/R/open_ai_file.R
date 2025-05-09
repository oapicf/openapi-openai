#' Create a new OpenAIFile
#'
#' @description
#' The `File` object represents a document that has been uploaded to OpenAI.
#'
#' @docType class
#' @title OpenAIFile
#' @description OpenAIFile Class
#' @format An \code{R6Class} generator object
#' @field id The file identifier, which can be referenced in the API endpoints. character
#' @field bytes The size of the file, in bytes. integer
#' @field created_at The Unix timestamp (in seconds) for when the file was created. integer
#' @field filename The name of the file. character
#' @field object The object type, which is always `file`. character
#' @field purpose The intended purpose of the file. Supported values are `fine-tune`, `fine-tune-results`, `assistants`, and `assistants_output`. character
#' @field status Deprecated. The current status of the file, which can be either `uploaded`, `processed`, or `error`. character
#' @field status_details Deprecated. For details on why a fine-tuning training file failed validation, see the `error` field on `fine_tuning.job`. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OpenAIFile <- R6::R6Class(
  "OpenAIFile",
  public = list(
    `id` = NULL,
    `bytes` = NULL,
    `created_at` = NULL,
    `filename` = NULL,
    `object` = NULL,
    `purpose` = NULL,
    `status` = NULL,
    `status_details` = NULL,

    #' @description
    #' Initialize a new OpenAIFile class.
    #'
    #' @param id The file identifier, which can be referenced in the API endpoints.
    #' @param bytes The size of the file, in bytes.
    #' @param created_at The Unix timestamp (in seconds) for when the file was created.
    #' @param filename The name of the file.
    #' @param object The object type, which is always `file`.
    #' @param purpose The intended purpose of the file. Supported values are `fine-tune`, `fine-tune-results`, `assistants`, and `assistants_output`.
    #' @param status Deprecated. The current status of the file, which can be either `uploaded`, `processed`, or `error`.
    #' @param status_details Deprecated. For details on why a fine-tuning training file failed validation, see the `error` field on `fine_tuning.job`.
    #' @param ... Other optional arguments.
    initialize = function(`id`, `bytes`, `created_at`, `filename`, `object`, `purpose`, `status`, `status_details` = NULL, ...) {
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`bytes`)) {
        if (!(is.numeric(`bytes`) && length(`bytes`) == 1)) {
          stop(paste("Error! Invalid data for `bytes`. Must be an integer:", `bytes`))
        }
        self$`bytes` <- `bytes`
      }
      if (!missing(`created_at`)) {
        if (!(is.numeric(`created_at`) && length(`created_at`) == 1)) {
          stop(paste("Error! Invalid data for `created_at`. Must be an integer:", `created_at`))
        }
        self$`created_at` <- `created_at`
      }
      if (!missing(`filename`)) {
        if (!(is.character(`filename`) && length(`filename`) == 1)) {
          stop(paste("Error! Invalid data for `filename`. Must be a string:", `filename`))
        }
        self$`filename` <- `filename`
      }
      if (!missing(`object`)) {
        if (!(`object` %in% c("file"))) {
          stop(paste("Error! \"", `object`, "\" cannot be assigned to `object`. Must be \"file\".", sep = ""))
        }
        if (!(is.character(`object`) && length(`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", `object`))
        }
        self$`object` <- `object`
      }
      if (!missing(`purpose`)) {
        if (!(`purpose` %in% c("fine-tune", "fine-tune-results", "assistants", "assistants_output"))) {
          stop(paste("Error! \"", `purpose`, "\" cannot be assigned to `purpose`. Must be \"fine-tune\", \"fine-tune-results\", \"assistants\", \"assistants_output\".", sep = ""))
        }
        if (!(is.character(`purpose`) && length(`purpose`) == 1)) {
          stop(paste("Error! Invalid data for `purpose`. Must be a string:", `purpose`))
        }
        self$`purpose` <- `purpose`
      }
      if (!missing(`status`)) {
        if (!(`status` %in% c("uploaded", "processed", "error"))) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be \"uploaded\", \"processed\", \"error\".", sep = ""))
        }
        if (!(is.character(`status`) && length(`status`) == 1)) {
          stop(paste("Error! Invalid data for `status`. Must be a string:", `status`))
        }
        self$`status` <- `status`
      }
      if (!is.null(`status_details`)) {
        if (!(is.character(`status_details`) && length(`status_details`) == 1)) {
          stop(paste("Error! Invalid data for `status_details`. Must be a string:", `status_details`))
        }
        self$`status_details` <- `status_details`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return OpenAIFile in JSON format
    toJSON = function() {
      OpenAIFileObject <- list()
      if (!is.null(self$`id`)) {
        OpenAIFileObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`bytes`)) {
        OpenAIFileObject[["bytes"]] <-
          self$`bytes`
      }
      if (!is.null(self$`created_at`)) {
        OpenAIFileObject[["created_at"]] <-
          self$`created_at`
      }
      if (!is.null(self$`filename`)) {
        OpenAIFileObject[["filename"]] <-
          self$`filename`
      }
      if (!is.null(self$`object`)) {
        OpenAIFileObject[["object"]] <-
          self$`object`
      }
      if (!is.null(self$`purpose`)) {
        OpenAIFileObject[["purpose"]] <-
          self$`purpose`
      }
      if (!is.null(self$`status`)) {
        OpenAIFileObject[["status"]] <-
          self$`status`
      }
      if (!is.null(self$`status_details`)) {
        OpenAIFileObject[["status_details"]] <-
          self$`status_details`
      }
      OpenAIFileObject
    },

    #' @description
    #' Deserialize JSON string into an instance of OpenAIFile
    #'
    #' @param input_json the JSON input
    #' @return the instance of OpenAIFile
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`bytes`)) {
        self$`bytes` <- this_object$`bytes`
      }
      if (!is.null(this_object$`created_at`)) {
        self$`created_at` <- this_object$`created_at`
      }
      if (!is.null(this_object$`filename`)) {
        self$`filename` <- this_object$`filename`
      }
      if (!is.null(this_object$`object`)) {
        if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("file"))) {
          stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"file\".", sep = ""))
        }
        self$`object` <- this_object$`object`
      }
      if (!is.null(this_object$`purpose`)) {
        if (!is.null(this_object$`purpose`) && !(this_object$`purpose` %in% c("fine-tune", "fine-tune-results", "assistants", "assistants_output"))) {
          stop(paste("Error! \"", this_object$`purpose`, "\" cannot be assigned to `purpose`. Must be \"fine-tune\", \"fine-tune-results\", \"assistants\", \"assistants_output\".", sep = ""))
        }
        self$`purpose` <- this_object$`purpose`
      }
      if (!is.null(this_object$`status`)) {
        if (!is.null(this_object$`status`) && !(this_object$`status` %in% c("uploaded", "processed", "error"))) {
          stop(paste("Error! \"", this_object$`status`, "\" cannot be assigned to `status`. Must be \"uploaded\", \"processed\", \"error\".", sep = ""))
        }
        self$`status` <- this_object$`status`
      }
      if (!is.null(this_object$`status_details`)) {
        self$`status_details` <- this_object$`status_details`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return OpenAIFile in JSON format
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
        if (!is.null(self$`bytes`)) {
          sprintf(
          '"bytes":
            %d
                    ',
          self$`bytes`
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
        if (!is.null(self$`filename`)) {
          sprintf(
          '"filename":
            "%s"
                    ',
          self$`filename`
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
        if (!is.null(self$`purpose`)) {
          sprintf(
          '"purpose":
            "%s"
                    ',
          self$`purpose`
          )
        },
        if (!is.null(self$`status`)) {
          sprintf(
          '"status":
            "%s"
                    ',
          self$`status`
          )
        },
        if (!is.null(self$`status_details`)) {
          sprintf(
          '"status_details":
            "%s"
                    ',
          self$`status_details`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of OpenAIFile
    #'
    #' @param input_json the JSON input
    #' @return the instance of OpenAIFile
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`bytes` <- this_object$`bytes`
      self$`created_at` <- this_object$`created_at`
      self$`filename` <- this_object$`filename`
      if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("file"))) {
        stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"file\".", sep = ""))
      }
      self$`object` <- this_object$`object`
      if (!is.null(this_object$`purpose`) && !(this_object$`purpose` %in% c("fine-tune", "fine-tune-results", "assistants", "assistants_output"))) {
        stop(paste("Error! \"", this_object$`purpose`, "\" cannot be assigned to `purpose`. Must be \"fine-tune\", \"fine-tune-results\", \"assistants\", \"assistants_output\".", sep = ""))
      }
      self$`purpose` <- this_object$`purpose`
      if (!is.null(this_object$`status`) && !(this_object$`status` %in% c("uploaded", "processed", "error"))) {
        stop(paste("Error! \"", this_object$`status`, "\" cannot be assigned to `status`. Must be \"uploaded\", \"processed\", \"error\".", sep = ""))
      }
      self$`status` <- this_object$`status`
      self$`status_details` <- this_object$`status_details`
      self
    },

    #' @description
    #' Validate JSON input with respect to OpenAIFile and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for OpenAIFile: the required field `id` is missing."))
      }
      # check the required field `bytes`
      if (!is.null(input_json$`bytes`)) {
        if (!(is.numeric(input_json$`bytes`) && length(input_json$`bytes`) == 1)) {
          stop(paste("Error! Invalid data for `bytes`. Must be an integer:", input_json$`bytes`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OpenAIFile: the required field `bytes` is missing."))
      }
      # check the required field `created_at`
      if (!is.null(input_json$`created_at`)) {
        if (!(is.numeric(input_json$`created_at`) && length(input_json$`created_at`) == 1)) {
          stop(paste("Error! Invalid data for `created_at`. Must be an integer:", input_json$`created_at`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OpenAIFile: the required field `created_at` is missing."))
      }
      # check the required field `filename`
      if (!is.null(input_json$`filename`)) {
        if (!(is.character(input_json$`filename`) && length(input_json$`filename`) == 1)) {
          stop(paste("Error! Invalid data for `filename`. Must be a string:", input_json$`filename`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OpenAIFile: the required field `filename` is missing."))
      }
      # check the required field `object`
      if (!is.null(input_json$`object`)) {
        if (!(is.character(input_json$`object`) && length(input_json$`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", input_json$`object`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OpenAIFile: the required field `object` is missing."))
      }
      # check the required field `purpose`
      if (!is.null(input_json$`purpose`)) {
        if (!(is.character(input_json$`purpose`) && length(input_json$`purpose`) == 1)) {
          stop(paste("Error! Invalid data for `purpose`. Must be a string:", input_json$`purpose`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OpenAIFile: the required field `purpose` is missing."))
      }
      # check the required field `status`
      if (!is.null(input_json$`status`)) {
        if (!(is.character(input_json$`status`) && length(input_json$`status`) == 1)) {
          stop(paste("Error! Invalid data for `status`. Must be a string:", input_json$`status`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for OpenAIFile: the required field `status` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of OpenAIFile
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

      # check if the required `bytes` is null
      if (is.null(self$`bytes`)) {
        return(FALSE)
      }

      # check if the required `created_at` is null
      if (is.null(self$`created_at`)) {
        return(FALSE)
      }

      # check if the required `filename` is null
      if (is.null(self$`filename`)) {
        return(FALSE)
      }

      # check if the required `object` is null
      if (is.null(self$`object`)) {
        return(FALSE)
      }

      # check if the required `purpose` is null
      if (is.null(self$`purpose`)) {
        return(FALSE)
      }

      # check if the required `status` is null
      if (is.null(self$`status`)) {
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

      # check if the required `bytes` is null
      if (is.null(self$`bytes`)) {
        invalid_fields["bytes"] <- "Non-nullable required field `bytes` cannot be null."
      }

      # check if the required `created_at` is null
      if (is.null(self$`created_at`)) {
        invalid_fields["created_at"] <- "Non-nullable required field `created_at` cannot be null."
      }

      # check if the required `filename` is null
      if (is.null(self$`filename`)) {
        invalid_fields["filename"] <- "Non-nullable required field `filename` cannot be null."
      }

      # check if the required `object` is null
      if (is.null(self$`object`)) {
        invalid_fields["object"] <- "Non-nullable required field `object` cannot be null."
      }

      # check if the required `purpose` is null
      if (is.null(self$`purpose`)) {
        invalid_fields["purpose"] <- "Non-nullable required field `purpose` cannot be null."
      }

      # check if the required `status` is null
      if (is.null(self$`status`)) {
        invalid_fields["status"] <- "Non-nullable required field `status` cannot be null."
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
# OpenAIFile$unlock()
#
## Below is an example to define the print function
# OpenAIFile$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# OpenAIFile$lock()

