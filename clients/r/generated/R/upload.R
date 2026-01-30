#' Create a new Upload
#'
#' @description
#' The Upload object can accept byte chunks in the form of Parts. 
#'
#' @docType class
#' @title Upload
#' @description Upload Class
#' @format An \code{R6Class} generator object
#' @field id The Upload unique identifier, which can be referenced in API endpoints. character
#' @field created_at The Unix timestamp (in seconds) for when the Upload was created. integer
#' @field filename The name of the file to be uploaded. character
#' @field bytes The intended number of bytes to be uploaded. integer
#' @field purpose The intended purpose of the file. [Please refer here](/docs/api-reference/files/object#files/object-purpose) for acceptable values. character
#' @field status The status of the Upload. character
#' @field expires_at The Unix timestamp (in seconds) for when the Upload was created. integer
#' @field object The object type, which is always \"upload\". character [optional]
#' @field file  \link{OpenAIFile} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Upload <- R6::R6Class(
  "Upload",
  public = list(
    `id` = NULL,
    `created_at` = NULL,
    `filename` = NULL,
    `bytes` = NULL,
    `purpose` = NULL,
    `status` = NULL,
    `expires_at` = NULL,
    `object` = NULL,
    `file` = NULL,

    #' @description
    #' Initialize a new Upload class.
    #'
    #' @param id The Upload unique identifier, which can be referenced in API endpoints.
    #' @param created_at The Unix timestamp (in seconds) for when the Upload was created.
    #' @param filename The name of the file to be uploaded.
    #' @param bytes The intended number of bytes to be uploaded.
    #' @param purpose The intended purpose of the file. [Please refer here](/docs/api-reference/files/object#files/object-purpose) for acceptable values.
    #' @param status The status of the Upload.
    #' @param expires_at The Unix timestamp (in seconds) for when the Upload was created.
    #' @param object The object type, which is always \"upload\".
    #' @param file file
    #' @param ... Other optional arguments.
    initialize = function(`id`, `created_at`, `filename`, `bytes`, `purpose`, `status`, `expires_at`, `object` = NULL, `file` = NULL, ...) {
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
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
      if (!missing(`bytes`)) {
        if (!(is.numeric(`bytes`) && length(`bytes`) == 1)) {
          stop(paste("Error! Invalid data for `bytes`. Must be an integer:", `bytes`))
        }
        self$`bytes` <- `bytes`
      }
      if (!missing(`purpose`)) {
        if (!(is.character(`purpose`) && length(`purpose`) == 1)) {
          stop(paste("Error! Invalid data for `purpose`. Must be a string:", `purpose`))
        }
        self$`purpose` <- `purpose`
      }
      if (!missing(`status`)) {
        if (!(`status` %in% c("pending", "completed", "cancelled", "expired"))) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be \"pending\", \"completed\", \"cancelled\", \"expired\".", sep = ""))
        }
        if (!(is.character(`status`) && length(`status`) == 1)) {
          stop(paste("Error! Invalid data for `status`. Must be a string:", `status`))
        }
        self$`status` <- `status`
      }
      if (!missing(`expires_at`)) {
        if (!(is.numeric(`expires_at`) && length(`expires_at`) == 1)) {
          stop(paste("Error! Invalid data for `expires_at`. Must be an integer:", `expires_at`))
        }
        self$`expires_at` <- `expires_at`
      }
      if (!is.null(`object`)) {
        if (!(`object` %in% c("upload"))) {
          stop(paste("Error! \"", `object`, "\" cannot be assigned to `object`. Must be \"upload\".", sep = ""))
        }
        if (!(is.character(`object`) && length(`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", `object`))
        }
        self$`object` <- `object`
      }
      if (!is.null(`file`)) {
        stopifnot(R6::is.R6(`file`))
        self$`file` <- `file`
      }
    },

    #' @description
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert to a List
    #'
    #' Convert the R6 object to a list to work more easily with other tooling.
    #'
    #' @return Upload as a base R list.
    #' @examples
    #' # convert array of Upload (x) to a data frame
    #' \dontrun{
    #' library(purrr)
    #' library(tibble)
    #' df <- x |> map(\(y)y$toList()) |> map(as_tibble) |> list_rbind()
    #' df
    #' }
    toList = function() {
      return(self$toSimpleType())
    },

    #' @description
    #' Convert Upload to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      UploadObject <- list()
      if (!is.null(self$`id`)) {
        UploadObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`created_at`)) {
        UploadObject[["created_at"]] <-
          self$`created_at`
      }
      if (!is.null(self$`filename`)) {
        UploadObject[["filename"]] <-
          self$`filename`
      }
      if (!is.null(self$`bytes`)) {
        UploadObject[["bytes"]] <-
          self$`bytes`
      }
      if (!is.null(self$`purpose`)) {
        UploadObject[["purpose"]] <-
          self$`purpose`
      }
      if (!is.null(self$`status`)) {
        UploadObject[["status"]] <-
          self$`status`
      }
      if (!is.null(self$`expires_at`)) {
        UploadObject[["expires_at"]] <-
          self$`expires_at`
      }
      if (!is.null(self$`object`)) {
        UploadObject[["object"]] <-
          self$`object`
      }
      if (!is.null(self$`file`)) {
        UploadObject[["file"]] <-
          self$`file`$toSimpleType()
      }
      return(UploadObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of Upload
    #'
    #' @param input_json the JSON input
    #' @return the instance of Upload
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`created_at`)) {
        self$`created_at` <- this_object$`created_at`
      }
      if (!is.null(this_object$`filename`)) {
        self$`filename` <- this_object$`filename`
      }
      if (!is.null(this_object$`bytes`)) {
        self$`bytes` <- this_object$`bytes`
      }
      if (!is.null(this_object$`purpose`)) {
        self$`purpose` <- this_object$`purpose`
      }
      if (!is.null(this_object$`status`)) {
        if (!is.null(this_object$`status`) && !(this_object$`status` %in% c("pending", "completed", "cancelled", "expired"))) {
          stop(paste("Error! \"", this_object$`status`, "\" cannot be assigned to `status`. Must be \"pending\", \"completed\", \"cancelled\", \"expired\".", sep = ""))
        }
        self$`status` <- this_object$`status`
      }
      if (!is.null(this_object$`expires_at`)) {
        self$`expires_at` <- this_object$`expires_at`
      }
      if (!is.null(this_object$`object`)) {
        if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("upload"))) {
          stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"upload\".", sep = ""))
        }
        self$`object` <- this_object$`object`
      }
      if (!is.null(this_object$`file`)) {
        `file_object` <- OpenAIFile$new()
        `file_object`$fromJSON(jsonlite::toJSON(this_object$`file`, auto_unbox = TRUE, digits = NA))
        self$`file` <- `file_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return Upload in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of Upload
    #'
    #' @param input_json the JSON input
    #' @return the instance of Upload
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`created_at` <- this_object$`created_at`
      self$`filename` <- this_object$`filename`
      self$`bytes` <- this_object$`bytes`
      self$`purpose` <- this_object$`purpose`
      if (!is.null(this_object$`status`) && !(this_object$`status` %in% c("pending", "completed", "cancelled", "expired"))) {
        stop(paste("Error! \"", this_object$`status`, "\" cannot be assigned to `status`. Must be \"pending\", \"completed\", \"cancelled\", \"expired\".", sep = ""))
      }
      self$`status` <- this_object$`status`
      self$`expires_at` <- this_object$`expires_at`
      if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("upload"))) {
        stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"upload\".", sep = ""))
      }
      self$`object` <- this_object$`object`
      self$`file` <- OpenAIFile$new()$fromJSON(jsonlite::toJSON(this_object$`file`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to Upload and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for Upload: the required field `id` is missing."))
      }
      # check the required field `created_at`
      if (!is.null(input_json$`created_at`)) {
        if (!(is.numeric(input_json$`created_at`) && length(input_json$`created_at`) == 1)) {
          stop(paste("Error! Invalid data for `created_at`. Must be an integer:", input_json$`created_at`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Upload: the required field `created_at` is missing."))
      }
      # check the required field `filename`
      if (!is.null(input_json$`filename`)) {
        if (!(is.character(input_json$`filename`) && length(input_json$`filename`) == 1)) {
          stop(paste("Error! Invalid data for `filename`. Must be a string:", input_json$`filename`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Upload: the required field `filename` is missing."))
      }
      # check the required field `bytes`
      if (!is.null(input_json$`bytes`)) {
        if (!(is.numeric(input_json$`bytes`) && length(input_json$`bytes`) == 1)) {
          stop(paste("Error! Invalid data for `bytes`. Must be an integer:", input_json$`bytes`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Upload: the required field `bytes` is missing."))
      }
      # check the required field `purpose`
      if (!is.null(input_json$`purpose`)) {
        if (!(is.character(input_json$`purpose`) && length(input_json$`purpose`) == 1)) {
          stop(paste("Error! Invalid data for `purpose`. Must be a string:", input_json$`purpose`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Upload: the required field `purpose` is missing."))
      }
      # check the required field `status`
      if (!is.null(input_json$`status`)) {
        if (!(is.character(input_json$`status`) && length(input_json$`status`) == 1)) {
          stop(paste("Error! Invalid data for `status`. Must be a string:", input_json$`status`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Upload: the required field `status` is missing."))
      }
      # check the required field `expires_at`
      if (!is.null(input_json$`expires_at`)) {
        if (!(is.numeric(input_json$`expires_at`) && length(input_json$`expires_at`) == 1)) {
          stop(paste("Error! Invalid data for `expires_at`. Must be an integer:", input_json$`expires_at`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Upload: the required field `expires_at` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of Upload
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

      # check if the required `created_at` is null
      if (is.null(self$`created_at`)) {
        return(FALSE)
      }

      # check if the required `filename` is null
      if (is.null(self$`filename`)) {
        return(FALSE)
      }

      # check if the required `bytes` is null
      if (is.null(self$`bytes`)) {
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

      # check if the required `expires_at` is null
      if (is.null(self$`expires_at`)) {
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

      # check if the required `created_at` is null
      if (is.null(self$`created_at`)) {
        invalid_fields["created_at"] <- "Non-nullable required field `created_at` cannot be null."
      }

      # check if the required `filename` is null
      if (is.null(self$`filename`)) {
        invalid_fields["filename"] <- "Non-nullable required field `filename` cannot be null."
      }

      # check if the required `bytes` is null
      if (is.null(self$`bytes`)) {
        invalid_fields["bytes"] <- "Non-nullable required field `bytes` cannot be null."
      }

      # check if the required `purpose` is null
      if (is.null(self$`purpose`)) {
        invalid_fields["purpose"] <- "Non-nullable required field `purpose` cannot be null."
      }

      # check if the required `status` is null
      if (is.null(self$`status`)) {
        invalid_fields["status"] <- "Non-nullable required field `status` cannot be null."
      }

      # check if the required `expires_at` is null
      if (is.null(self$`expires_at`)) {
        invalid_fields["expires_at"] <- "Non-nullable required field `expires_at` cannot be null."
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
# Upload$unlock()
#
## Below is an example to define the print function
# Upload$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# Upload$lock()

