#' Create a new User
#'
#' @description
#' Represents an individual `user` within an organization.
#'
#' @docType class
#' @title User
#' @description User Class
#' @format An \code{R6Class} generator object
#' @field object The object type, which is always `organization.user` character
#' @field id The identifier, which can be referenced in API endpoints character
#' @field name The name of the user character
#' @field email The email address of the user character
#' @field role `owner` or `reader` character
#' @field added_at The Unix timestamp (in seconds) of when the user was added. integer
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
User <- R6::R6Class(
  "User",
  public = list(
    `object` = NULL,
    `id` = NULL,
    `name` = NULL,
    `email` = NULL,
    `role` = NULL,
    `added_at` = NULL,

    #' @description
    #' Initialize a new User class.
    #'
    #' @param object The object type, which is always `organization.user`
    #' @param id The identifier, which can be referenced in API endpoints
    #' @param name The name of the user
    #' @param email The email address of the user
    #' @param role `owner` or `reader`
    #' @param added_at The Unix timestamp (in seconds) of when the user was added.
    #' @param ... Other optional arguments.
    initialize = function(`object`, `id`, `name`, `email`, `role`, `added_at`, ...) {
      if (!missing(`object`)) {
        if (!(`object` %in% c("organization.user"))) {
          stop(paste("Error! \"", `object`, "\" cannot be assigned to `object`. Must be \"organization.user\".", sep = ""))
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
      if (!missing(`email`)) {
        if (!(is.character(`email`) && length(`email`) == 1)) {
          stop(paste("Error! Invalid data for `email`. Must be a string:", `email`))
        }
        self$`email` <- `email`
      }
      if (!missing(`role`)) {
        if (!(`role` %in% c("owner", "reader"))) {
          stop(paste("Error! \"", `role`, "\" cannot be assigned to `role`. Must be \"owner\", \"reader\".", sep = ""))
        }
        if (!(is.character(`role`) && length(`role`) == 1)) {
          stop(paste("Error! Invalid data for `role`. Must be a string:", `role`))
        }
        self$`role` <- `role`
      }
      if (!missing(`added_at`)) {
        if (!(is.numeric(`added_at`) && length(`added_at`) == 1)) {
          stop(paste("Error! Invalid data for `added_at`. Must be an integer:", `added_at`))
        }
        self$`added_at` <- `added_at`
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
    #' @return User as a base R list.
    #' @examples
    #' # convert array of User (x) to a data frame
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
    #' Convert User to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      UserObject <- list()
      if (!is.null(self$`object`)) {
        UserObject[["object"]] <-
          self$`object`
      }
      if (!is.null(self$`id`)) {
        UserObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`name`)) {
        UserObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`email`)) {
        UserObject[["email"]] <-
          self$`email`
      }
      if (!is.null(self$`role`)) {
        UserObject[["role"]] <-
          self$`role`
      }
      if (!is.null(self$`added_at`)) {
        UserObject[["added_at"]] <-
          self$`added_at`
      }
      return(UserObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of User
    #'
    #' @param input_json the JSON input
    #' @return the instance of User
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`object`)) {
        if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("organization.user"))) {
          stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"organization.user\".", sep = ""))
        }
        self$`object` <- this_object$`object`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`email`)) {
        self$`email` <- this_object$`email`
      }
      if (!is.null(this_object$`role`)) {
        if (!is.null(this_object$`role`) && !(this_object$`role` %in% c("owner", "reader"))) {
          stop(paste("Error! \"", this_object$`role`, "\" cannot be assigned to `role`. Must be \"owner\", \"reader\".", sep = ""))
        }
        self$`role` <- this_object$`role`
      }
      if (!is.null(this_object$`added_at`)) {
        self$`added_at` <- this_object$`added_at`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return User in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of User
    #'
    #' @param input_json the JSON input
    #' @return the instance of User
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("organization.user"))) {
        stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"organization.user\".", sep = ""))
      }
      self$`object` <- this_object$`object`
      self$`id` <- this_object$`id`
      self$`name` <- this_object$`name`
      self$`email` <- this_object$`email`
      if (!is.null(this_object$`role`) && !(this_object$`role` %in% c("owner", "reader"))) {
        stop(paste("Error! \"", this_object$`role`, "\" cannot be assigned to `role`. Must be \"owner\", \"reader\".", sep = ""))
      }
      self$`role` <- this_object$`role`
      self$`added_at` <- this_object$`added_at`
      self
    },

    #' @description
    #' Validate JSON input with respect to User and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for User: the required field `object` is missing."))
      }
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.character(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for User: the required field `id` is missing."))
      }
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for User: the required field `name` is missing."))
      }
      # check the required field `email`
      if (!is.null(input_json$`email`)) {
        if (!(is.character(input_json$`email`) && length(input_json$`email`) == 1)) {
          stop(paste("Error! Invalid data for `email`. Must be a string:", input_json$`email`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for User: the required field `email` is missing."))
      }
      # check the required field `role`
      if (!is.null(input_json$`role`)) {
        if (!(is.character(input_json$`role`) && length(input_json$`role`) == 1)) {
          stop(paste("Error! Invalid data for `role`. Must be a string:", input_json$`role`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for User: the required field `role` is missing."))
      }
      # check the required field `added_at`
      if (!is.null(input_json$`added_at`)) {
        if (!(is.numeric(input_json$`added_at`) && length(input_json$`added_at`) == 1)) {
          stop(paste("Error! Invalid data for `added_at`. Must be an integer:", input_json$`added_at`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for User: the required field `added_at` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of User
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

      # check if the required `email` is null
      if (is.null(self$`email`)) {
        return(FALSE)
      }

      # check if the required `role` is null
      if (is.null(self$`role`)) {
        return(FALSE)
      }

      # check if the required `added_at` is null
      if (is.null(self$`added_at`)) {
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

      # check if the required `email` is null
      if (is.null(self$`email`)) {
        invalid_fields["email"] <- "Non-nullable required field `email` cannot be null."
      }

      # check if the required `role` is null
      if (is.null(self$`role`)) {
        invalid_fields["role"] <- "Non-nullable required field `role` cannot be null."
      }

      # check if the required `added_at` is null
      if (is.null(self$`added_at`)) {
        invalid_fields["added_at"] <- "Non-nullable required field `added_at` cannot be null."
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
# User$unlock()
#
## Below is an example to define the print function
# User$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# User$lock()

