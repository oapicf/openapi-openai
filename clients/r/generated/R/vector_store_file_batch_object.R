#' Create a new VectorStoreFileBatchObject
#'
#' @description
#' A batch of files attached to a vector store.
#'
#' @docType class
#' @title VectorStoreFileBatchObject
#' @description VectorStoreFileBatchObject Class
#' @format An \code{R6Class} generator object
#' @field id The identifier, which can be referenced in API endpoints. character
#' @field object The object type, which is always `vector_store.file_batch`. character
#' @field created_at The Unix timestamp (in seconds) for when the vector store files batch was created. integer
#' @field vector_store_id The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to. character
#' @field status The status of the vector store files batch, which can be either `in_progress`, `completed`, `cancelled` or `failed`. character
#' @field file_counts  \link{VectorStoreFileBatchObjectFileCounts}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
VectorStoreFileBatchObject <- R6::R6Class(
  "VectorStoreFileBatchObject",
  public = list(
    `id` = NULL,
    `object` = NULL,
    `created_at` = NULL,
    `vector_store_id` = NULL,
    `status` = NULL,
    `file_counts` = NULL,

    #' @description
    #' Initialize a new VectorStoreFileBatchObject class.
    #'
    #' @param id The identifier, which can be referenced in API endpoints.
    #' @param object The object type, which is always `vector_store.file_batch`.
    #' @param created_at The Unix timestamp (in seconds) for when the vector store files batch was created.
    #' @param vector_store_id The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to.
    #' @param status The status of the vector store files batch, which can be either `in_progress`, `completed`, `cancelled` or `failed`.
    #' @param file_counts file_counts
    #' @param ... Other optional arguments.
    initialize = function(`id`, `object`, `created_at`, `vector_store_id`, `status`, `file_counts`, ...) {
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`object`)) {
        if (!(`object` %in% c("vector_store.files_batch"))) {
          stop(paste("Error! \"", `object`, "\" cannot be assigned to `object`. Must be \"vector_store.files_batch\".", sep = ""))
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
      if (!missing(`vector_store_id`)) {
        if (!(is.character(`vector_store_id`) && length(`vector_store_id`) == 1)) {
          stop(paste("Error! Invalid data for `vector_store_id`. Must be a string:", `vector_store_id`))
        }
        self$`vector_store_id` <- `vector_store_id`
      }
      if (!missing(`status`)) {
        if (!(`status` %in% c("in_progress", "completed", "cancelled", "failed"))) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be \"in_progress\", \"completed\", \"cancelled\", \"failed\".", sep = ""))
        }
        if (!(is.character(`status`) && length(`status`) == 1)) {
          stop(paste("Error! Invalid data for `status`. Must be a string:", `status`))
        }
        self$`status` <- `status`
      }
      if (!missing(`file_counts`)) {
        stopifnot(R6::is.R6(`file_counts`))
        self$`file_counts` <- `file_counts`
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
    #' @return VectorStoreFileBatchObject as a base R list.
    #' @examples
    #' # convert array of VectorStoreFileBatchObject (x) to a data frame
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
    #' Convert VectorStoreFileBatchObject to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      VectorStoreFileBatchObjectObject <- list()
      if (!is.null(self$`id`)) {
        VectorStoreFileBatchObjectObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`object`)) {
        VectorStoreFileBatchObjectObject[["object"]] <-
          self$`object`
      }
      if (!is.null(self$`created_at`)) {
        VectorStoreFileBatchObjectObject[["created_at"]] <-
          self$`created_at`
      }
      if (!is.null(self$`vector_store_id`)) {
        VectorStoreFileBatchObjectObject[["vector_store_id"]] <-
          self$`vector_store_id`
      }
      if (!is.null(self$`status`)) {
        VectorStoreFileBatchObjectObject[["status"]] <-
          self$`status`
      }
      if (!is.null(self$`file_counts`)) {
        VectorStoreFileBatchObjectObject[["file_counts"]] <-
          self$`file_counts`$toSimpleType()
      }
      return(VectorStoreFileBatchObjectObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of VectorStoreFileBatchObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of VectorStoreFileBatchObject
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`object`)) {
        if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("vector_store.files_batch"))) {
          stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"vector_store.files_batch\".", sep = ""))
        }
        self$`object` <- this_object$`object`
      }
      if (!is.null(this_object$`created_at`)) {
        self$`created_at` <- this_object$`created_at`
      }
      if (!is.null(this_object$`vector_store_id`)) {
        self$`vector_store_id` <- this_object$`vector_store_id`
      }
      if (!is.null(this_object$`status`)) {
        if (!is.null(this_object$`status`) && !(this_object$`status` %in% c("in_progress", "completed", "cancelled", "failed"))) {
          stop(paste("Error! \"", this_object$`status`, "\" cannot be assigned to `status`. Must be \"in_progress\", \"completed\", \"cancelled\", \"failed\".", sep = ""))
        }
        self$`status` <- this_object$`status`
      }
      if (!is.null(this_object$`file_counts`)) {
        `file_counts_object` <- VectorStoreFileBatchObjectFileCounts$new()
        `file_counts_object`$fromJSON(jsonlite::toJSON(this_object$`file_counts`, auto_unbox = TRUE, digits = NA))
        self$`file_counts` <- `file_counts_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return VectorStoreFileBatchObject in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of VectorStoreFileBatchObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of VectorStoreFileBatchObject
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("vector_store.files_batch"))) {
        stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"vector_store.files_batch\".", sep = ""))
      }
      self$`object` <- this_object$`object`
      self$`created_at` <- this_object$`created_at`
      self$`vector_store_id` <- this_object$`vector_store_id`
      if (!is.null(this_object$`status`) && !(this_object$`status` %in% c("in_progress", "completed", "cancelled", "failed"))) {
        stop(paste("Error! \"", this_object$`status`, "\" cannot be assigned to `status`. Must be \"in_progress\", \"completed\", \"cancelled\", \"failed\".", sep = ""))
      }
      self$`status` <- this_object$`status`
      self$`file_counts` <- VectorStoreFileBatchObjectFileCounts$new()$fromJSON(jsonlite::toJSON(this_object$`file_counts`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to VectorStoreFileBatchObject and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for VectorStoreFileBatchObject: the required field `id` is missing."))
      }
      # check the required field `object`
      if (!is.null(input_json$`object`)) {
        if (!(is.character(input_json$`object`) && length(input_json$`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", input_json$`object`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for VectorStoreFileBatchObject: the required field `object` is missing."))
      }
      # check the required field `created_at`
      if (!is.null(input_json$`created_at`)) {
        if (!(is.numeric(input_json$`created_at`) && length(input_json$`created_at`) == 1)) {
          stop(paste("Error! Invalid data for `created_at`. Must be an integer:", input_json$`created_at`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for VectorStoreFileBatchObject: the required field `created_at` is missing."))
      }
      # check the required field `vector_store_id`
      if (!is.null(input_json$`vector_store_id`)) {
        if (!(is.character(input_json$`vector_store_id`) && length(input_json$`vector_store_id`) == 1)) {
          stop(paste("Error! Invalid data for `vector_store_id`. Must be a string:", input_json$`vector_store_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for VectorStoreFileBatchObject: the required field `vector_store_id` is missing."))
      }
      # check the required field `status`
      if (!is.null(input_json$`status`)) {
        if (!(is.character(input_json$`status`) && length(input_json$`status`) == 1)) {
          stop(paste("Error! Invalid data for `status`. Must be a string:", input_json$`status`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for VectorStoreFileBatchObject: the required field `status` is missing."))
      }
      # check the required field `file_counts`
      if (!is.null(input_json$`file_counts`)) {
        stopifnot(R6::is.R6(input_json$`file_counts`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for VectorStoreFileBatchObject: the required field `file_counts` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of VectorStoreFileBatchObject
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

      # check if the required `vector_store_id` is null
      if (is.null(self$`vector_store_id`)) {
        return(FALSE)
      }

      # check if the required `status` is null
      if (is.null(self$`status`)) {
        return(FALSE)
      }

      # check if the required `file_counts` is null
      if (is.null(self$`file_counts`)) {
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

      # check if the required `vector_store_id` is null
      if (is.null(self$`vector_store_id`)) {
        invalid_fields["vector_store_id"] <- "Non-nullable required field `vector_store_id` cannot be null."
      }

      # check if the required `status` is null
      if (is.null(self$`status`)) {
        invalid_fields["status"] <- "Non-nullable required field `status` cannot be null."
      }

      # check if the required `file_counts` is null
      if (is.null(self$`file_counts`)) {
        invalid_fields["file_counts"] <- "Non-nullable required field `file_counts` cannot be null."
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
# VectorStoreFileBatchObject$unlock()
#
## Below is an example to define the print function
# VectorStoreFileBatchObject$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# VectorStoreFileBatchObject$lock()

