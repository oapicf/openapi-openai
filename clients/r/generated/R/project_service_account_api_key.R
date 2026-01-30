#' Create a new ProjectServiceAccountApiKey
#'
#' @description
#' ProjectServiceAccountApiKey Class
#'
#' @docType class
#' @title ProjectServiceAccountApiKey
#' @description ProjectServiceAccountApiKey Class
#' @format An \code{R6Class} generator object
#' @field object The object type, which is always `organization.project.service_account.api_key` character
#' @field value  character
#' @field name  character
#' @field created_at  integer
#' @field id  character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ProjectServiceAccountApiKey <- R6::R6Class(
  "ProjectServiceAccountApiKey",
  public = list(
    `object` = NULL,
    `value` = NULL,
    `name` = NULL,
    `created_at` = NULL,
    `id` = NULL,

    #' @description
    #' Initialize a new ProjectServiceAccountApiKey class.
    #'
    #' @param object The object type, which is always `organization.project.service_account.api_key`
    #' @param value value
    #' @param name name
    #' @param created_at created_at
    #' @param id id
    #' @param ... Other optional arguments.
    initialize = function(`object`, `value`, `name`, `created_at`, `id`, ...) {
      if (!missing(`object`)) {
        if (!(`object` %in% c("organization.project.service_account.api_key"))) {
          stop(paste("Error! \"", `object`, "\" cannot be assigned to `object`. Must be \"organization.project.service_account.api_key\".", sep = ""))
        }
        if (!(is.character(`object`) && length(`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", `object`))
        }
        self$`object` <- `object`
      }
      if (!missing(`value`)) {
        if (!(is.character(`value`) && length(`value`) == 1)) {
          stop(paste("Error! Invalid data for `value`. Must be a string:", `value`))
        }
        self$`value` <- `value`
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
    #' @return ProjectServiceAccountApiKey as a base R list.
    #' @examples
    #' # convert array of ProjectServiceAccountApiKey (x) to a data frame
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
    #' Convert ProjectServiceAccountApiKey to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ProjectServiceAccountApiKeyObject <- list()
      if (!is.null(self$`object`)) {
        ProjectServiceAccountApiKeyObject[["object"]] <-
          self$`object`
      }
      if (!is.null(self$`value`)) {
        ProjectServiceAccountApiKeyObject[["value"]] <-
          self$`value`
      }
      if (!is.null(self$`name`)) {
        ProjectServiceAccountApiKeyObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`created_at`)) {
        ProjectServiceAccountApiKeyObject[["created_at"]] <-
          self$`created_at`
      }
      if (!is.null(self$`id`)) {
        ProjectServiceAccountApiKeyObject[["id"]] <-
          self$`id`
      }
      return(ProjectServiceAccountApiKeyObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ProjectServiceAccountApiKey
    #'
    #' @param input_json the JSON input
    #' @return the instance of ProjectServiceAccountApiKey
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`object`)) {
        if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("organization.project.service_account.api_key"))) {
          stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"organization.project.service_account.api_key\".", sep = ""))
        }
        self$`object` <- this_object$`object`
      }
      if (!is.null(this_object$`value`)) {
        self$`value` <- this_object$`value`
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
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ProjectServiceAccountApiKey in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ProjectServiceAccountApiKey
    #'
    #' @param input_json the JSON input
    #' @return the instance of ProjectServiceAccountApiKey
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("organization.project.service_account.api_key"))) {
        stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"organization.project.service_account.api_key\".", sep = ""))
      }
      self$`object` <- this_object$`object`
      self$`value` <- this_object$`value`
      self$`name` <- this_object$`name`
      self$`created_at` <- this_object$`created_at`
      self$`id` <- this_object$`id`
      self
    },

    #' @description
    #' Validate JSON input with respect to ProjectServiceAccountApiKey and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for ProjectServiceAccountApiKey: the required field `object` is missing."))
      }
      # check the required field `value`
      if (!is.null(input_json$`value`)) {
        if (!(is.character(input_json$`value`) && length(input_json$`value`) == 1)) {
          stop(paste("Error! Invalid data for `value`. Must be a string:", input_json$`value`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ProjectServiceAccountApiKey: the required field `value` is missing."))
      }
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ProjectServiceAccountApiKey: the required field `name` is missing."))
      }
      # check the required field `created_at`
      if (!is.null(input_json$`created_at`)) {
        if (!(is.numeric(input_json$`created_at`) && length(input_json$`created_at`) == 1)) {
          stop(paste("Error! Invalid data for `created_at`. Must be an integer:", input_json$`created_at`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ProjectServiceAccountApiKey: the required field `created_at` is missing."))
      }
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.character(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ProjectServiceAccountApiKey: the required field `id` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ProjectServiceAccountApiKey
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

      # check if the required `value` is null
      if (is.null(self$`value`)) {
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

      # check if the required `value` is null
      if (is.null(self$`value`)) {
        invalid_fields["value"] <- "Non-nullable required field `value` cannot be null."
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
# ProjectServiceAccountApiKey$unlock()
#
## Below is an example to define the print function
# ProjectServiceAccountApiKey$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ProjectServiceAccountApiKey$lock()

