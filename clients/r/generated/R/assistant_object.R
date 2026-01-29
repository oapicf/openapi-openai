#' Create a new AssistantObject
#'
#' @description
#' Represents an `assistant` that can call the model and use tools.
#'
#' @docType class
#' @title AssistantObject
#' @description AssistantObject Class
#' @format An \code{R6Class} generator object
#' @field id The identifier, which can be referenced in API endpoints. character
#' @field object The object type, which is always `assistant`. character
#' @field created_at The Unix timestamp (in seconds) for when the assistant was created. integer
#' @field name The name of the assistant. The maximum length is 256 characters. character
#' @field description The description of the assistant. The maximum length is 512 characters. character
#' @field model ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them. character
#' @field instructions The system instructions that the assistant uses. The maximum length is 256,000 characters. character
#' @field tools A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`. list(\link{AssistantObjectToolsInner})
#' @field file_ids A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. list(character)
#' @field metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. object
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AssistantObject <- R6::R6Class(
  "AssistantObject",
  public = list(
    `id` = NULL,
    `object` = NULL,
    `created_at` = NULL,
    `name` = NULL,
    `description` = NULL,
    `model` = NULL,
    `instructions` = NULL,
    `tools` = NULL,
    `file_ids` = NULL,
    `metadata` = NULL,

    #' @description
    #' Initialize a new AssistantObject class.
    #'
    #' @param id The identifier, which can be referenced in API endpoints.
    #' @param object The object type, which is always `assistant`.
    #' @param created_at The Unix timestamp (in seconds) for when the assistant was created.
    #' @param name The name of the assistant. The maximum length is 256 characters.
    #' @param description The description of the assistant. The maximum length is 512 characters.
    #' @param model ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them.
    #' @param instructions The system instructions that the assistant uses. The maximum length is 256,000 characters.
    #' @param tools A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`.
    #' @param file_ids A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order.
    #' @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.
    #' @param ... Other optional arguments.
    initialize = function(`id`, `object`, `created_at`, `name`, `description`, `model`, `instructions`, `tools`, `file_ids`, `metadata`, ...) {
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`object`)) {
        if (!(`object` %in% c("assistant"))) {
          stop(paste("Error! \"", `object`, "\" cannot be assigned to `object`. Must be \"assistant\".", sep = ""))
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
      if (!missing(`description`)) {
        if (!(is.character(`description`) && length(`description`) == 1)) {
          stop(paste("Error! Invalid data for `description`. Must be a string:", `description`))
        }
        self$`description` <- `description`
      }
      if (!missing(`model`)) {
        if (!(is.character(`model`) && length(`model`) == 1)) {
          stop(paste("Error! Invalid data for `model`. Must be a string:", `model`))
        }
        self$`model` <- `model`
      }
      if (!missing(`instructions`)) {
        if (!(is.character(`instructions`) && length(`instructions`) == 1)) {
          stop(paste("Error! Invalid data for `instructions`. Must be a string:", `instructions`))
        }
        self$`instructions` <- `instructions`
      }
      if (!missing(`tools`)) {
        stopifnot(is.vector(`tools`), length(`tools`) != 0)
        sapply(`tools`, function(x) stopifnot(R6::is.R6(x)))
        self$`tools` <- `tools`
      }
      if (!missing(`file_ids`)) {
        stopifnot(is.vector(`file_ids`), length(`file_ids`) != 0)
        sapply(`file_ids`, function(x) stopifnot(is.character(x)))
        self$`file_ids` <- `file_ids`
      }
      if (!missing(`metadata`)) {
        self$`metadata` <- `metadata`
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
    #' @return AssistantObject as a base R list.
    #' @examples
    #' # convert array of AssistantObject (x) to a data frame
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
    #' Convert AssistantObject to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AssistantObjectObject <- list()
      if (!is.null(self$`id`)) {
        AssistantObjectObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`object`)) {
        AssistantObjectObject[["object"]] <-
          self$`object`
      }
      if (!is.null(self$`created_at`)) {
        AssistantObjectObject[["created_at"]] <-
          self$`created_at`
      }
      if (!is.null(self$`name`)) {
        AssistantObjectObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`description`)) {
        AssistantObjectObject[["description"]] <-
          self$`description`
      }
      if (!is.null(self$`model`)) {
        AssistantObjectObject[["model"]] <-
          self$`model`
      }
      if (!is.null(self$`instructions`)) {
        AssistantObjectObject[["instructions"]] <-
          self$`instructions`
      }
      if (!is.null(self$`tools`)) {
        AssistantObjectObject[["tools"]] <-
          lapply(self$`tools`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`file_ids`)) {
        AssistantObjectObject[["file_ids"]] <-
          self$`file_ids`
      }
      if (!is.null(self$`metadata`)) {
        AssistantObjectObject[["metadata"]] <-
          self$`metadata`
      }
      return(AssistantObjectObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of AssistantObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of AssistantObject
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`object`)) {
        if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("assistant"))) {
          stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"assistant\".", sep = ""))
        }
        self$`object` <- this_object$`object`
      }
      if (!is.null(this_object$`created_at`)) {
        self$`created_at` <- this_object$`created_at`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`description`)) {
        self$`description` <- this_object$`description`
      }
      if (!is.null(this_object$`model`)) {
        self$`model` <- this_object$`model`
      }
      if (!is.null(this_object$`instructions`)) {
        self$`instructions` <- this_object$`instructions`
      }
      if (!is.null(this_object$`tools`)) {
        self$`tools` <- ApiClient$new()$deserializeObj(this_object$`tools`, "array[AssistantObjectToolsInner]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`file_ids`)) {
        self$`file_ids` <- ApiClient$new()$deserializeObj(this_object$`file_ids`, "array[character]", loadNamespace("openapi"))
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
    #' @return AssistantObject in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AssistantObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of AssistantObject
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("assistant"))) {
        stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"assistant\".", sep = ""))
      }
      self$`object` <- this_object$`object`
      self$`created_at` <- this_object$`created_at`
      self$`name` <- this_object$`name`
      self$`description` <- this_object$`description`
      self$`model` <- this_object$`model`
      self$`instructions` <- this_object$`instructions`
      self$`tools` <- ApiClient$new()$deserializeObj(this_object$`tools`, "array[AssistantObjectToolsInner]", loadNamespace("openapi"))
      self$`file_ids` <- ApiClient$new()$deserializeObj(this_object$`file_ids`, "array[character]", loadNamespace("openapi"))
      self$`metadata` <- this_object$`metadata`
      self
    },

    #' @description
    #' Validate JSON input with respect to AssistantObject and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for AssistantObject: the required field `id` is missing."))
      }
      # check the required field `object`
      if (!is.null(input_json$`object`)) {
        if (!(is.character(input_json$`object`) && length(input_json$`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", input_json$`object`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AssistantObject: the required field `object` is missing."))
      }
      # check the required field `created_at`
      if (!is.null(input_json$`created_at`)) {
        if (!(is.numeric(input_json$`created_at`) && length(input_json$`created_at`) == 1)) {
          stop(paste("Error! Invalid data for `created_at`. Must be an integer:", input_json$`created_at`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AssistantObject: the required field `created_at` is missing."))
      }
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AssistantObject: the required field `name` is missing."))
      }
      # check the required field `description`
      if (!is.null(input_json$`description`)) {
        if (!(is.character(input_json$`description`) && length(input_json$`description`) == 1)) {
          stop(paste("Error! Invalid data for `description`. Must be a string:", input_json$`description`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AssistantObject: the required field `description` is missing."))
      }
      # check the required field `model`
      if (!is.null(input_json$`model`)) {
        if (!(is.character(input_json$`model`) && length(input_json$`model`) == 1)) {
          stop(paste("Error! Invalid data for `model`. Must be a string:", input_json$`model`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AssistantObject: the required field `model` is missing."))
      }
      # check the required field `instructions`
      if (!is.null(input_json$`instructions`)) {
        if (!(is.character(input_json$`instructions`) && length(input_json$`instructions`) == 1)) {
          stop(paste("Error! Invalid data for `instructions`. Must be a string:", input_json$`instructions`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AssistantObject: the required field `instructions` is missing."))
      }
      # check the required field `tools`
      if (!is.null(input_json$`tools`)) {
        stopifnot(is.vector(input_json$`tools`), length(input_json$`tools`) != 0)
        tmp <- sapply(input_json$`tools`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AssistantObject: the required field `tools` is missing."))
      }
      # check the required field `file_ids`
      if (!is.null(input_json$`file_ids`)) {
        stopifnot(is.vector(input_json$`file_ids`), length(input_json$`file_ids`) != 0)
        tmp <- sapply(input_json$`file_ids`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AssistantObject: the required field `file_ids` is missing."))
      }
      # check the required field `metadata`
      if (!is.null(input_json$`metadata`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AssistantObject: the required field `metadata` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AssistantObject
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

      if (nchar(self$`name`) > 256) {
        return(FALSE)
      }

      if (nchar(self$`description`) > 512) {
        return(FALSE)
      }

      # check if the required `model` is null
      if (is.null(self$`model`)) {
        return(FALSE)
      }

      if (nchar(self$`instructions`) > 256000) {
        return(FALSE)
      }

      # check if the required `tools` is null
      if (is.null(self$`tools`)) {
        return(FALSE)
      }

      if (length(self$`tools`) > 128) {
        return(FALSE)
      }

      # check if the required `file_ids` is null
      if (is.null(self$`file_ids`)) {
        return(FALSE)
      }

      if (length(self$`file_ids`) > 20) {
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

      if (nchar(self$`name`) > 256) {
        invalid_fields["name"] <- "Invalid length for `name`, must be smaller than or equal to 256."
      }

      if (nchar(self$`description`) > 512) {
        invalid_fields["description"] <- "Invalid length for `description`, must be smaller than or equal to 512."
      }

      # check if the required `model` is null
      if (is.null(self$`model`)) {
        invalid_fields["model"] <- "Non-nullable required field `model` cannot be null."
      }

      if (nchar(self$`instructions`) > 256000) {
        invalid_fields["instructions"] <- "Invalid length for `instructions`, must be smaller than or equal to 256000."
      }

      # check if the required `tools` is null
      if (is.null(self$`tools`)) {
        invalid_fields["tools"] <- "Non-nullable required field `tools` cannot be null."
      }

      if (length(self$`tools`) > 128) {
        invalid_fields["tools"] <- "Invalid length for `tools`, number of items must be less than or equal to 128."
      }

      # check if the required `file_ids` is null
      if (is.null(self$`file_ids`)) {
        invalid_fields["file_ids"] <- "Non-nullable required field `file_ids` cannot be null."
      }

      if (length(self$`file_ids`) > 20) {
        invalid_fields["file_ids"] <- "Invalid length for `file_ids`, number of items must be less than or equal to 20."
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
# AssistantObject$unlock()
#
## Below is an example to define the print function
# AssistantObject$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AssistantObject$lock()

