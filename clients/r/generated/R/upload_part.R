#' Create a new UploadPart
#'
#' @description
#' The upload Part represents a chunk of bytes we can add to an Upload object. 
#'
#' @docType class
#' @title UploadPart
#' @description UploadPart Class
#' @format An \code{R6Class} generator object
#' @field id The upload Part unique identifier, which can be referenced in API endpoints. character
#' @field created_at The Unix timestamp (in seconds) for when the Part was created. integer
#' @field upload_id The ID of the Upload object that this Part was added to. character
#' @field object The object type, which is always `upload.part`. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UploadPart <- R6::R6Class(
  "UploadPart",
  public = list(
    `id` = NULL,
    `created_at` = NULL,
    `upload_id` = NULL,
    `object` = NULL,

    #' @description
    #' Initialize a new UploadPart class.
    #'
    #' @param id The upload Part unique identifier, which can be referenced in API endpoints.
    #' @param created_at The Unix timestamp (in seconds) for when the Part was created.
    #' @param upload_id The ID of the Upload object that this Part was added to.
    #' @param object The object type, which is always `upload.part`.
    #' @param ... Other optional arguments.
    initialize = function(`id`, `created_at`, `upload_id`, `object`, ...) {
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
      if (!missing(`upload_id`)) {
        if (!(is.character(`upload_id`) && length(`upload_id`) == 1)) {
          stop(paste("Error! Invalid data for `upload_id`. Must be a string:", `upload_id`))
        }
        self$`upload_id` <- `upload_id`
      }
      if (!missing(`object`)) {
        if (!(`object` %in% c("upload.part"))) {
          stop(paste("Error! \"", `object`, "\" cannot be assigned to `object`. Must be \"upload.part\".", sep = ""))
        }
        if (!(is.character(`object`) && length(`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", `object`))
        }
        self$`object` <- `object`
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
    #' @return UploadPart as a base R list.
    #' @examples
    #' # convert array of UploadPart (x) to a data frame
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
    #' Convert UploadPart to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      UploadPartObject <- list()
      if (!is.null(self$`id`)) {
        UploadPartObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`created_at`)) {
        UploadPartObject[["created_at"]] <-
          self$`created_at`
      }
      if (!is.null(self$`upload_id`)) {
        UploadPartObject[["upload_id"]] <-
          self$`upload_id`
      }
      if (!is.null(self$`object`)) {
        UploadPartObject[["object"]] <-
          self$`object`
      }
      return(UploadPartObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of UploadPart
    #'
    #' @param input_json the JSON input
    #' @return the instance of UploadPart
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`created_at`)) {
        self$`created_at` <- this_object$`created_at`
      }
      if (!is.null(this_object$`upload_id`)) {
        self$`upload_id` <- this_object$`upload_id`
      }
      if (!is.null(this_object$`object`)) {
        if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("upload.part"))) {
          stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"upload.part\".", sep = ""))
        }
        self$`object` <- this_object$`object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return UploadPart in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of UploadPart
    #'
    #' @param input_json the JSON input
    #' @return the instance of UploadPart
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`created_at` <- this_object$`created_at`
      self$`upload_id` <- this_object$`upload_id`
      if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("upload.part"))) {
        stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"upload.part\".", sep = ""))
      }
      self$`object` <- this_object$`object`
      self
    },

    #' @description
    #' Validate JSON input with respect to UploadPart and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for UploadPart: the required field `id` is missing."))
      }
      # check the required field `created_at`
      if (!is.null(input_json$`created_at`)) {
        if (!(is.numeric(input_json$`created_at`) && length(input_json$`created_at`) == 1)) {
          stop(paste("Error! Invalid data for `created_at`. Must be an integer:", input_json$`created_at`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for UploadPart: the required field `created_at` is missing."))
      }
      # check the required field `upload_id`
      if (!is.null(input_json$`upload_id`)) {
        if (!(is.character(input_json$`upload_id`) && length(input_json$`upload_id`) == 1)) {
          stop(paste("Error! Invalid data for `upload_id`. Must be a string:", input_json$`upload_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for UploadPart: the required field `upload_id` is missing."))
      }
      # check the required field `object`
      if (!is.null(input_json$`object`)) {
        if (!(is.character(input_json$`object`) && length(input_json$`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", input_json$`object`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for UploadPart: the required field `object` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of UploadPart
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

      # check if the required `upload_id` is null
      if (is.null(self$`upload_id`)) {
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

      # check if the required `created_at` is null
      if (is.null(self$`created_at`)) {
        invalid_fields["created_at"] <- "Non-nullable required field `created_at` cannot be null."
      }

      # check if the required `upload_id` is null
      if (is.null(self$`upload_id`)) {
        invalid_fields["upload_id"] <- "Non-nullable required field `upload_id` cannot be null."
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
# UploadPart$unlock()
#
## Below is an example to define the print function
# UploadPart$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# UploadPart$lock()

