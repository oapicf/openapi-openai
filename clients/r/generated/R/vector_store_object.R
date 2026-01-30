#' Create a new VectorStoreObject
#'
#' @description
#' A vector store is a collection of processed files can be used by the `file_search` tool.
#'
#' @docType class
#' @title VectorStoreObject
#' @description VectorStoreObject Class
#' @format An \code{R6Class} generator object
#' @field id The identifier, which can be referenced in API endpoints. character
#' @field object The object type, which is always `vector_store`. character
#' @field created_at The Unix timestamp (in seconds) for when the vector store was created. integer
#' @field name The name of the vector store. character
#' @field usage_bytes The total number of bytes used by the files in the vector store. integer
#' @field file_counts  \link{VectorStoreObjectFileCounts}
#' @field status The status of the vector store, which can be either `expired`, `in_progress`, or `completed`. A status of `completed` indicates that the vector store is ready for use. character
#' @field expires_after  \link{VectorStoreExpirationAfter} [optional]
#' @field expires_at The Unix timestamp (in seconds) for when the vector store will expire. integer [optional]
#' @field last_active_at The Unix timestamp (in seconds) for when the vector store was last active. integer
#' @field metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
VectorStoreObject <- R6::R6Class(
  "VectorStoreObject",
  public = list(
    `id` = NULL,
    `object` = NULL,
    `created_at` = NULL,
    `name` = NULL,
    `usage_bytes` = NULL,
    `file_counts` = NULL,
    `status` = NULL,
    `expires_after` = NULL,
    `expires_at` = NULL,
    `last_active_at` = NULL,
    `metadata` = NULL,

    #' @description
    #' Initialize a new VectorStoreObject class.
    #'
    #' @param id The identifier, which can be referenced in API endpoints.
    #' @param object The object type, which is always `vector_store`.
    #' @param created_at The Unix timestamp (in seconds) for when the vector store was created.
    #' @param name The name of the vector store.
    #' @param usage_bytes The total number of bytes used by the files in the vector store.
    #' @param file_counts file_counts
    #' @param status The status of the vector store, which can be either `expired`, `in_progress`, or `completed`. A status of `completed` indicates that the vector store is ready for use.
    #' @param last_active_at The Unix timestamp (in seconds) for when the vector store was last active.
    #' @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.
    #' @param expires_after expires_after
    #' @param expires_at The Unix timestamp (in seconds) for when the vector store will expire.
    #' @param ... Other optional arguments.
    initialize = function(`id`, `object`, `created_at`, `name`, `usage_bytes`, `file_counts`, `status`, `last_active_at`, `metadata`, `expires_after` = NULL, `expires_at` = NULL, ...) {
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`object`)) {
        if (!(`object` %in% c("vector_store"))) {
          stop(paste("Error! \"", `object`, "\" cannot be assigned to `object`. Must be \"vector_store\".", sep = ""))
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
      if (!missing(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!missing(`usage_bytes`)) {
        if (!(is.numeric(`usage_bytes`) && length(`usage_bytes`) == 1)) {
          stop(paste("Error! Invalid data for `usage_bytes`. Must be an integer:", `usage_bytes`))
        }
        self$`usage_bytes` <- `usage_bytes`
      }
      if (!missing(`file_counts`)) {
        stopifnot(R6::is.R6(`file_counts`))
        self$`file_counts` <- `file_counts`
      }
      if (!missing(`status`)) {
        if (!(`status` %in% c("expired", "in_progress", "completed"))) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be \"expired\", \"in_progress\", \"completed\".", sep = ""))
        }
        if (!(is.character(`status`) && length(`status`) == 1)) {
          stop(paste("Error! Invalid data for `status`. Must be a string:", `status`))
        }
        self$`status` <- `status`
      }
      if (!missing(`last_active_at`)) {
        if (!(is.numeric(`last_active_at`) && length(`last_active_at`) == 1)) {
          stop(paste("Error! Invalid data for `last_active_at`. Must be an integer:", `last_active_at`))
        }
        self$`last_active_at` <- `last_active_at`
      }
      if (!missing(`metadata`)) {
        self$`metadata` <- `metadata`
      }
      if (!is.null(`expires_after`)) {
        stopifnot(R6::is.R6(`expires_after`))
        self$`expires_after` <- `expires_after`
      }
      if (!is.null(`expires_at`)) {
        if (!(is.numeric(`expires_at`) && length(`expires_at`) == 1)) {
          stop(paste("Error! Invalid data for `expires_at`. Must be an integer:", `expires_at`))
        }
        self$`expires_at` <- `expires_at`
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
    #' @return VectorStoreObject as a base R list.
    #' @examples
    #' # convert array of VectorStoreObject (x) to a data frame
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
    #' Convert VectorStoreObject to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      VectorStoreObjectObject <- list()
      if (!is.null(self$`id`)) {
        VectorStoreObjectObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`object`)) {
        VectorStoreObjectObject[["object"]] <-
          self$`object`
      }
      if (!is.null(self$`created_at`)) {
        VectorStoreObjectObject[["created_at"]] <-
          self$`created_at`
      }
      if (!is.null(self$`name`)) {
        VectorStoreObjectObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`usage_bytes`)) {
        VectorStoreObjectObject[["usage_bytes"]] <-
          self$`usage_bytes`
      }
      if (!is.null(self$`file_counts`)) {
        VectorStoreObjectObject[["file_counts"]] <-
          self$`file_counts`$toSimpleType()
      }
      if (!is.null(self$`status`)) {
        VectorStoreObjectObject[["status"]] <-
          self$`status`
      }
      if (!is.null(self$`expires_after`)) {
        VectorStoreObjectObject[["expires_after"]] <-
          self$`expires_after`$toSimpleType()
      }
      if (!is.null(self$`expires_at`)) {
        VectorStoreObjectObject[["expires_at"]] <-
          self$`expires_at`
      }
      if (!is.null(self$`last_active_at`)) {
        VectorStoreObjectObject[["last_active_at"]] <-
          self$`last_active_at`
      }
      if (!is.null(self$`metadata`)) {
        VectorStoreObjectObject[["metadata"]] <-
          self$`metadata`
      }
      return(VectorStoreObjectObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of VectorStoreObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of VectorStoreObject
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`object`)) {
        if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("vector_store"))) {
          stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"vector_store\".", sep = ""))
        }
        self$`object` <- this_object$`object`
      }
      if (!is.null(this_object$`created_at`)) {
        self$`created_at` <- this_object$`created_at`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`usage_bytes`)) {
        self$`usage_bytes` <- this_object$`usage_bytes`
      }
      if (!is.null(this_object$`file_counts`)) {
        `file_counts_object` <- VectorStoreObjectFileCounts$new()
        `file_counts_object`$fromJSON(jsonlite::toJSON(this_object$`file_counts`, auto_unbox = TRUE, digits = NA))
        self$`file_counts` <- `file_counts_object`
      }
      if (!is.null(this_object$`status`)) {
        if (!is.null(this_object$`status`) && !(this_object$`status` %in% c("expired", "in_progress", "completed"))) {
          stop(paste("Error! \"", this_object$`status`, "\" cannot be assigned to `status`. Must be \"expired\", \"in_progress\", \"completed\".", sep = ""))
        }
        self$`status` <- this_object$`status`
      }
      if (!is.null(this_object$`expires_after`)) {
        `expires_after_object` <- VectorStoreExpirationAfter$new()
        `expires_after_object`$fromJSON(jsonlite::toJSON(this_object$`expires_after`, auto_unbox = TRUE, digits = NA))
        self$`expires_after` <- `expires_after_object`
      }
      if (!is.null(this_object$`expires_at`)) {
        self$`expires_at` <- this_object$`expires_at`
      }
      if (!is.null(this_object$`last_active_at`)) {
        self$`last_active_at` <- this_object$`last_active_at`
      }
      if (!is.null(this_object$`metadata`)) {
        self$`metadata` <- this_object$`metadata`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return VectorStoreObject in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of VectorStoreObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of VectorStoreObject
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("vector_store"))) {
        stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"vector_store\".", sep = ""))
      }
      self$`object` <- this_object$`object`
      self$`created_at` <- this_object$`created_at`
      self$`name` <- this_object$`name`
      self$`usage_bytes` <- this_object$`usage_bytes`
      self$`file_counts` <- VectorStoreObjectFileCounts$new()$fromJSON(jsonlite::toJSON(this_object$`file_counts`, auto_unbox = TRUE, digits = NA))
      if (!is.null(this_object$`status`) && !(this_object$`status` %in% c("expired", "in_progress", "completed"))) {
        stop(paste("Error! \"", this_object$`status`, "\" cannot be assigned to `status`. Must be \"expired\", \"in_progress\", \"completed\".", sep = ""))
      }
      self$`status` <- this_object$`status`
      self$`expires_after` <- VectorStoreExpirationAfter$new()$fromJSON(jsonlite::toJSON(this_object$`expires_after`, auto_unbox = TRUE, digits = NA))
      self$`expires_at` <- this_object$`expires_at`
      self$`last_active_at` <- this_object$`last_active_at`
      self$`metadata` <- this_object$`metadata`
      self
    },

    #' @description
    #' Validate JSON input with respect to VectorStoreObject and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for VectorStoreObject: the required field `id` is missing."))
      }
      # check the required field `object`
      if (!is.null(input_json$`object`)) {
        if (!(is.character(input_json$`object`) && length(input_json$`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", input_json$`object`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for VectorStoreObject: the required field `object` is missing."))
      }
      # check the required field `created_at`
      if (!is.null(input_json$`created_at`)) {
        if (!(is.numeric(input_json$`created_at`) && length(input_json$`created_at`) == 1)) {
          stop(paste("Error! Invalid data for `created_at`. Must be an integer:", input_json$`created_at`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for VectorStoreObject: the required field `created_at` is missing."))
      }
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for VectorStoreObject: the required field `name` is missing."))
      }
      # check the required field `usage_bytes`
      if (!is.null(input_json$`usage_bytes`)) {
        if (!(is.numeric(input_json$`usage_bytes`) && length(input_json$`usage_bytes`) == 1)) {
          stop(paste("Error! Invalid data for `usage_bytes`. Must be an integer:", input_json$`usage_bytes`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for VectorStoreObject: the required field `usage_bytes` is missing."))
      }
      # check the required field `file_counts`
      if (!is.null(input_json$`file_counts`)) {
        stopifnot(R6::is.R6(input_json$`file_counts`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for VectorStoreObject: the required field `file_counts` is missing."))
      }
      # check the required field `status`
      if (!is.null(input_json$`status`)) {
        if (!(is.character(input_json$`status`) && length(input_json$`status`) == 1)) {
          stop(paste("Error! Invalid data for `status`. Must be a string:", input_json$`status`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for VectorStoreObject: the required field `status` is missing."))
      }
      # check the required field `last_active_at`
      if (!is.null(input_json$`last_active_at`)) {
        if (!(is.numeric(input_json$`last_active_at`) && length(input_json$`last_active_at`) == 1)) {
          stop(paste("Error! Invalid data for `last_active_at`. Must be an integer:", input_json$`last_active_at`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for VectorStoreObject: the required field `last_active_at` is missing."))
      }
      # check the required field `metadata`
      if (!is.null(input_json$`metadata`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for VectorStoreObject: the required field `metadata` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of VectorStoreObject
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

      # check if the required `object` is null
      if (is.null(self$`object`)) {
        return(FALSE)
      }

      # check if the required `created_at` is null
      if (is.null(self$`created_at`)) {
        return(FALSE)
      }

      # check if the required `name` is null
      if (is.null(self$`name`)) {
        return(FALSE)
      }

      # check if the required `usage_bytes` is null
      if (is.null(self$`usage_bytes`)) {
        return(FALSE)
      }

      # check if the required `file_counts` is null
      if (is.null(self$`file_counts`)) {
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

      # check if the required `object` is null
      if (is.null(self$`object`)) {
        invalid_fields["object"] <- "Non-nullable required field `object` cannot be null."
      }

      # check if the required `created_at` is null
      if (is.null(self$`created_at`)) {
        invalid_fields["created_at"] <- "Non-nullable required field `created_at` cannot be null."
      }

      # check if the required `name` is null
      if (is.null(self$`name`)) {
        invalid_fields["name"] <- "Non-nullable required field `name` cannot be null."
      }

      # check if the required `usage_bytes` is null
      if (is.null(self$`usage_bytes`)) {
        invalid_fields["usage_bytes"] <- "Non-nullable required field `usage_bytes` cannot be null."
      }

      # check if the required `file_counts` is null
      if (is.null(self$`file_counts`)) {
        invalid_fields["file_counts"] <- "Non-nullable required field `file_counts` cannot be null."
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
# VectorStoreObject$unlock()
#
## Below is an example to define the print function
# VectorStoreObject$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# VectorStoreObject$lock()

