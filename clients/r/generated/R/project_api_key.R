#' Create a new ProjectApiKey
#'
#' @description
#' Represents an individual API key in a project.
#'
#' @docType class
#' @title ProjectApiKey
#' @description ProjectApiKey Class
#' @format An \code{R6Class} generator object
#' @field object The object type, which is always `organization.project.api_key` character
#' @field redacted_value The redacted value of the API key character
#' @field name The name of the API key character
#' @field created_at The Unix timestamp (in seconds) of when the API key was created integer
#' @field id The identifier, which can be referenced in API endpoints character
#' @field owner  \link{ProjectApiKeyOwner}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ProjectApiKey <- R6::R6Class(
  "ProjectApiKey",
  public = list(
    `object` = NULL,
    `redacted_value` = NULL,
    `name` = NULL,
    `created_at` = NULL,
    `id` = NULL,
    `owner` = NULL,

    #' @description
    #' Initialize a new ProjectApiKey class.
    #'
    #' @param object The object type, which is always `organization.project.api_key`
    #' @param redacted_value The redacted value of the API key
    #' @param name The name of the API key
    #' @param created_at The Unix timestamp (in seconds) of when the API key was created
    #' @param id The identifier, which can be referenced in API endpoints
    #' @param owner owner
    #' @param ... Other optional arguments.
    initialize = function(`object`, `redacted_value`, `name`, `created_at`, `id`, `owner`, ...) {
      if (!missing(`object`)) {
        if (!(`object` %in% c("organization.project.api_key"))) {
          stop(paste("Error! \"", `object`, "\" cannot be assigned to `object`. Must be \"organization.project.api_key\".", sep = ""))
        }
        if (!(is.character(`object`) && length(`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", `object`))
        }
        self$`object` <- `object`
      }
      if (!missing(`redacted_value`)) {
        if (!(is.character(`redacted_value`) && length(`redacted_value`) == 1)) {
          stop(paste("Error! Invalid data for `redacted_value`. Must be a string:", `redacted_value`))
        }
        self$`redacted_value` <- `redacted_value`
      }
      if (!missing(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!missing(`created_at`)) {
        if (!(is.numeric(`created_at`) && length(`created_at`) == 1)) {
          stop(paste("Error! Invalid data for `created_at`. Must be an integer:", `created_at`))
        }
        self$`created_at` <- `created_at`
      }
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`owner`)) {
        stopifnot(R6::is.R6(`owner`))
        self$`owner` <- `owner`
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
    #' @return ProjectApiKey as a base R list.
    #' @examples
    #' # convert array of ProjectApiKey (x) to a data frame
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
    #' Convert ProjectApiKey to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ProjectApiKeyObject <- list()
      if (!is.null(self$`object`)) {
        ProjectApiKeyObject[["object"]] <-
          self$`object`
      }
      if (!is.null(self$`redacted_value`)) {
        ProjectApiKeyObject[["redacted_value"]] <-
          self$`redacted_value`
      }
      if (!is.null(self$`name`)) {
        ProjectApiKeyObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`created_at`)) {
        ProjectApiKeyObject[["created_at"]] <-
          self$`created_at`
      }
      if (!is.null(self$`id`)) {
        ProjectApiKeyObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`owner`)) {
        ProjectApiKeyObject[["owner"]] <-
          self$`owner`$toSimpleType()
      }
      return(ProjectApiKeyObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ProjectApiKey
    #'
    #' @param input_json the JSON input
    #' @return the instance of ProjectApiKey
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`object`)) {
        if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("organization.project.api_key"))) {
          stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"organization.project.api_key\".", sep = ""))
        }
        self$`object` <- this_object$`object`
      }
      if (!is.null(this_object$`redacted_value`)) {
        self$`redacted_value` <- this_object$`redacted_value`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`created_at`)) {
        self$`created_at` <- this_object$`created_at`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`owner`)) {
        `owner_object` <- ProjectApiKeyOwner$new()
        `owner_object`$fromJSON(jsonlite::toJSON(this_object$`owner`, auto_unbox = TRUE, digits = NA))
        self$`owner` <- `owner_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ProjectApiKey in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ProjectApiKey
    #'
    #' @param input_json the JSON input
    #' @return the instance of ProjectApiKey
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("organization.project.api_key"))) {
        stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"organization.project.api_key\".", sep = ""))
      }
      self$`object` <- this_object$`object`
      self$`redacted_value` <- this_object$`redacted_value`
      self$`name` <- this_object$`name`
      self$`created_at` <- this_object$`created_at`
      self$`id` <- this_object$`id`
      self$`owner` <- ProjectApiKeyOwner$new()$fromJSON(jsonlite::toJSON(this_object$`owner`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to ProjectApiKey and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `object`
      if (!is.null(input_json$`object`)) {
        if (!(is.character(input_json$`object`) && length(input_json$`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", input_json$`object`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ProjectApiKey: the required field `object` is missing."))
      }
      # check the required field `redacted_value`
      if (!is.null(input_json$`redacted_value`)) {
        if (!(is.character(input_json$`redacted_value`) && length(input_json$`redacted_value`) == 1)) {
          stop(paste("Error! Invalid data for `redacted_value`. Must be a string:", input_json$`redacted_value`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ProjectApiKey: the required field `redacted_value` is missing."))
      }
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ProjectApiKey: the required field `name` is missing."))
      }
      # check the required field `created_at`
      if (!is.null(input_json$`created_at`)) {
        if (!(is.numeric(input_json$`created_at`) && length(input_json$`created_at`) == 1)) {
          stop(paste("Error! Invalid data for `created_at`. Must be an integer:", input_json$`created_at`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ProjectApiKey: the required field `created_at` is missing."))
      }
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.character(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ProjectApiKey: the required field `id` is missing."))
      }
      # check the required field `owner`
      if (!is.null(input_json$`owner`)) {
        stopifnot(R6::is.R6(input_json$`owner`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ProjectApiKey: the required field `owner` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ProjectApiKey
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `object` is null
      if (is.null(self$`object`)) {
        return(FALSE)
      }

      # check if the required `redacted_value` is null
      if (is.null(self$`redacted_value`)) {
        return(FALSE)
      }

      # check if the required `name` is null
      if (is.null(self$`name`)) {
        return(FALSE)
      }

      # check if the required `created_at` is null
      if (is.null(self$`created_at`)) {
        return(FALSE)
      }

      # check if the required `id` is null
      if (is.null(self$`id`)) {
        return(FALSE)
      }

      # check if the required `owner` is null
      if (is.null(self$`owner`)) {
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
      # check if the required `object` is null
      if (is.null(self$`object`)) {
        invalid_fields["object"] <- "Non-nullable required field `object` cannot be null."
      }

      # check if the required `redacted_value` is null
      if (is.null(self$`redacted_value`)) {
        invalid_fields["redacted_value"] <- "Non-nullable required field `redacted_value` cannot be null."
      }

      # check if the required `name` is null
      if (is.null(self$`name`)) {
        invalid_fields["name"] <- "Non-nullable required field `name` cannot be null."
      }

      # check if the required `created_at` is null
      if (is.null(self$`created_at`)) {
        invalid_fields["created_at"] <- "Non-nullable required field `created_at` cannot be null."
      }

      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
      }

      # check if the required `owner` is null
      if (is.null(self$`owner`)) {
        invalid_fields["owner"] <- "Non-nullable required field `owner` cannot be null."
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
# ProjectApiKey$unlock()
#
## Below is an example to define the print function
# ProjectApiKey$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ProjectApiKey$lock()

