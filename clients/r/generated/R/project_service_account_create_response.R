#' Create a new ProjectServiceAccountCreateResponse
#'
#' @description
#' ProjectServiceAccountCreateResponse Class
#'
#' @docType class
#' @title ProjectServiceAccountCreateResponse
#' @description ProjectServiceAccountCreateResponse Class
#' @format An \code{R6Class} generator object
#' @field object  character
#' @field id  character
#' @field name  character
#' @field role Service accounts can only have one role of type `member` character
#' @field created_at  integer
#' @field api_key  \link{ProjectServiceAccountApiKey}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ProjectServiceAccountCreateResponse <- R6::R6Class(
  "ProjectServiceAccountCreateResponse",
  public = list(
    `object` = NULL,
    `id` = NULL,
    `name` = NULL,
    `role` = NULL,
    `created_at` = NULL,
    `api_key` = NULL,

    #' @description
    #' Initialize a new ProjectServiceAccountCreateResponse class.
    #'
    #' @param object object
    #' @param id id
    #' @param name name
    #' @param role Service accounts can only have one role of type `member`
    #' @param created_at created_at
    #' @param api_key api_key
    #' @param ... Other optional arguments.
    initialize = function(`object`, `id`, `name`, `role`, `created_at`, `api_key`, ...) {
      if (!missing(`object`)) {
        if (!(`object` %in% c("organization.project.service_account"))) {
          stop(paste("Error! \"", `object`, "\" cannot be assigned to `object`. Must be \"organization.project.service_account\".", sep = ""))
        }
        if (!(is.character(`object`) && length(`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", `object`))
        }
        self$`object` <- `object`
      }
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!missing(`role`)) {
        if (!(`role` %in% c("member"))) {
          stop(paste("Error! \"", `role`, "\" cannot be assigned to `role`. Must be \"member\".", sep = ""))
        }
        if (!(is.character(`role`) && length(`role`) == 1)) {
          stop(paste("Error! Invalid data for `role`. Must be a string:", `role`))
        }
        self$`role` <- `role`
      }
      if (!missing(`created_at`)) {
        if (!(is.numeric(`created_at`) && length(`created_at`) == 1)) {
          stop(paste("Error! Invalid data for `created_at`. Must be an integer:", `created_at`))
        }
        self$`created_at` <- `created_at`
      }
      if (!missing(`api_key`)) {
        stopifnot(R6::is.R6(`api_key`))
        self$`api_key` <- `api_key`
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
    #' @return ProjectServiceAccountCreateResponse as a base R list.
    #' @examples
    #' # convert array of ProjectServiceAccountCreateResponse (x) to a data frame
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
    #' Convert ProjectServiceAccountCreateResponse to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ProjectServiceAccountCreateResponseObject <- list()
      if (!is.null(self$`object`)) {
        ProjectServiceAccountCreateResponseObject[["object"]] <-
          self$`object`
      }
      if (!is.null(self$`id`)) {
        ProjectServiceAccountCreateResponseObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`name`)) {
        ProjectServiceAccountCreateResponseObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`role`)) {
        ProjectServiceAccountCreateResponseObject[["role"]] <-
          self$`role`
      }
      if (!is.null(self$`created_at`)) {
        ProjectServiceAccountCreateResponseObject[["created_at"]] <-
          self$`created_at`
      }
      if (!is.null(self$`api_key`)) {
        ProjectServiceAccountCreateResponseObject[["api_key"]] <-
          self$`api_key`$toSimpleType()
      }
      return(ProjectServiceAccountCreateResponseObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ProjectServiceAccountCreateResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of ProjectServiceAccountCreateResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`object`)) {
        if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("organization.project.service_account"))) {
          stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"organization.project.service_account\".", sep = ""))
        }
        self$`object` <- this_object$`object`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`role`)) {
        if (!is.null(this_object$`role`) && !(this_object$`role` %in% c("member"))) {
          stop(paste("Error! \"", this_object$`role`, "\" cannot be assigned to `role`. Must be \"member\".", sep = ""))
        }
        self$`role` <- this_object$`role`
      }
      if (!is.null(this_object$`created_at`)) {
        self$`created_at` <- this_object$`created_at`
      }
      if (!is.null(this_object$`api_key`)) {
        `api_key_object` <- ProjectServiceAccountApiKey$new()
        `api_key_object`$fromJSON(jsonlite::toJSON(this_object$`api_key`, auto_unbox = TRUE, digits = NA))
        self$`api_key` <- `api_key_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ProjectServiceAccountCreateResponse in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ProjectServiceAccountCreateResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of ProjectServiceAccountCreateResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("organization.project.service_account"))) {
        stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"organization.project.service_account\".", sep = ""))
      }
      self$`object` <- this_object$`object`
      self$`id` <- this_object$`id`
      self$`name` <- this_object$`name`
      if (!is.null(this_object$`role`) && !(this_object$`role` %in% c("member"))) {
        stop(paste("Error! \"", this_object$`role`, "\" cannot be assigned to `role`. Must be \"member\".", sep = ""))
      }
      self$`role` <- this_object$`role`
      self$`created_at` <- this_object$`created_at`
      self$`api_key` <- ProjectServiceAccountApiKey$new()$fromJSON(jsonlite::toJSON(this_object$`api_key`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to ProjectServiceAccountCreateResponse and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for ProjectServiceAccountCreateResponse: the required field `object` is missing."))
      }
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.character(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ProjectServiceAccountCreateResponse: the required field `id` is missing."))
      }
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ProjectServiceAccountCreateResponse: the required field `name` is missing."))
      }
      # check the required field `role`
      if (!is.null(input_json$`role`)) {
        if (!(is.character(input_json$`role`) && length(input_json$`role`) == 1)) {
          stop(paste("Error! Invalid data for `role`. Must be a string:", input_json$`role`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ProjectServiceAccountCreateResponse: the required field `role` is missing."))
      }
      # check the required field `created_at`
      if (!is.null(input_json$`created_at`)) {
        if (!(is.numeric(input_json$`created_at`) && length(input_json$`created_at`) == 1)) {
          stop(paste("Error! Invalid data for `created_at`. Must be an integer:", input_json$`created_at`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ProjectServiceAccountCreateResponse: the required field `created_at` is missing."))
      }
      # check the required field `api_key`
      if (!is.null(input_json$`api_key`)) {
        stopifnot(R6::is.R6(input_json$`api_key`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ProjectServiceAccountCreateResponse: the required field `api_key` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ProjectServiceAccountCreateResponse
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

      # check if the required `id` is null
      if (is.null(self$`id`)) {
        return(FALSE)
      }

      # check if the required `name` is null
      if (is.null(self$`name`)) {
        return(FALSE)
      }

      # check if the required `role` is null
      if (is.null(self$`role`)) {
        return(FALSE)
      }

      # check if the required `created_at` is null
      if (is.null(self$`created_at`)) {
        return(FALSE)
      }

      # check if the required `api_key` is null
      if (is.null(self$`api_key`)) {
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

      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
      }

      # check if the required `name` is null
      if (is.null(self$`name`)) {
        invalid_fields["name"] <- "Non-nullable required field `name` cannot be null."
      }

      # check if the required `role` is null
      if (is.null(self$`role`)) {
        invalid_fields["role"] <- "Non-nullable required field `role` cannot be null."
      }

      # check if the required `created_at` is null
      if (is.null(self$`created_at`)) {
        invalid_fields["created_at"] <- "Non-nullable required field `created_at` cannot be null."
      }

      # check if the required `api_key` is null
      if (is.null(self$`api_key`)) {
        invalid_fields["api_key"] <- "Non-nullable required field `api_key` cannot be null."
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
# ProjectServiceAccountCreateResponse$unlock()
#
## Below is an example to define the print function
# ProjectServiceAccountCreateResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ProjectServiceAccountCreateResponse$lock()

