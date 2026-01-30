#' Create a new Invite
#'
#' @description
#' Represents an individual `invite` to the organization.
#'
#' @docType class
#' @title Invite
#' @description Invite Class
#' @format An \code{R6Class} generator object
#' @field object The object type, which is always `organization.invite` character
#' @field id The identifier, which can be referenced in API endpoints character
#' @field email The email address of the individual to whom the invite was sent character
#' @field role `owner` or `reader` character
#' @field status `accepted`,`expired`, or `pending` character
#' @field invited_at The Unix timestamp (in seconds) of when the invite was sent. integer
#' @field expires_at The Unix timestamp (in seconds) of when the invite expires. integer
#' @field accepted_at The Unix timestamp (in seconds) of when the invite was accepted. integer [optional]
#' @field projects The projects that were granted membership upon acceptance of the invite. list(\link{InviteProjectsInner}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Invite <- R6::R6Class(
  "Invite",
  public = list(
    `object` = NULL,
    `id` = NULL,
    `email` = NULL,
    `role` = NULL,
    `status` = NULL,
    `invited_at` = NULL,
    `expires_at` = NULL,
    `accepted_at` = NULL,
    `projects` = NULL,

    #' @description
    #' Initialize a new Invite class.
    #'
    #' @param object The object type, which is always `organization.invite`
    #' @param id The identifier, which can be referenced in API endpoints
    #' @param email The email address of the individual to whom the invite was sent
    #' @param role `owner` or `reader`
    #' @param status `accepted`,`expired`, or `pending`
    #' @param invited_at The Unix timestamp (in seconds) of when the invite was sent.
    #' @param expires_at The Unix timestamp (in seconds) of when the invite expires.
    #' @param accepted_at The Unix timestamp (in seconds) of when the invite was accepted.
    #' @param projects The projects that were granted membership upon acceptance of the invite.
    #' @param ... Other optional arguments.
    initialize = function(`object`, `id`, `email`, `role`, `status`, `invited_at`, `expires_at`, `accepted_at` = NULL, `projects` = NULL, ...) {
      if (!missing(`object`)) {
        if (!(`object` %in% c("organization.invite"))) {
          stop(paste("Error! \"", `object`, "\" cannot be assigned to `object`. Must be \"organization.invite\".", sep = ""))
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
      if (!missing(`status`)) {
        if (!(`status` %in% c("accepted", "expired", "pending"))) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be \"accepted\", \"expired\", \"pending\".", sep = ""))
        }
        if (!(is.character(`status`) && length(`status`) == 1)) {
          stop(paste("Error! Invalid data for `status`. Must be a string:", `status`))
        }
        self$`status` <- `status`
      }
      if (!missing(`invited_at`)) {
        if (!(is.numeric(`invited_at`) && length(`invited_at`) == 1)) {
          stop(paste("Error! Invalid data for `invited_at`. Must be an integer:", `invited_at`))
        }
        self$`invited_at` <- `invited_at`
      }
      if (!missing(`expires_at`)) {
        if (!(is.numeric(`expires_at`) && length(`expires_at`) == 1)) {
          stop(paste("Error! Invalid data for `expires_at`. Must be an integer:", `expires_at`))
        }
        self$`expires_at` <- `expires_at`
      }
      if (!is.null(`accepted_at`)) {
        if (!(is.numeric(`accepted_at`) && length(`accepted_at`) == 1)) {
          stop(paste("Error! Invalid data for `accepted_at`. Must be an integer:", `accepted_at`))
        }
        self$`accepted_at` <- `accepted_at`
      }
      if (!is.null(`projects`)) {
        stopifnot(is.vector(`projects`), length(`projects`) != 0)
        sapply(`projects`, function(x) stopifnot(R6::is.R6(x)))
        self$`projects` <- `projects`
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
    #' @return Invite as a base R list.
    #' @examples
    #' # convert array of Invite (x) to a data frame
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
    #' Convert Invite to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      InviteObject <- list()
      if (!is.null(self$`object`)) {
        InviteObject[["object"]] <-
          self$`object`
      }
      if (!is.null(self$`id`)) {
        InviteObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`email`)) {
        InviteObject[["email"]] <-
          self$`email`
      }
      if (!is.null(self$`role`)) {
        InviteObject[["role"]] <-
          self$`role`
      }
      if (!is.null(self$`status`)) {
        InviteObject[["status"]] <-
          self$`status`
      }
      if (!is.null(self$`invited_at`)) {
        InviteObject[["invited_at"]] <-
          self$`invited_at`
      }
      if (!is.null(self$`expires_at`)) {
        InviteObject[["expires_at"]] <-
          self$`expires_at`
      }
      if (!is.null(self$`accepted_at`)) {
        InviteObject[["accepted_at"]] <-
          self$`accepted_at`
      }
      if (!is.null(self$`projects`)) {
        InviteObject[["projects"]] <-
          lapply(self$`projects`, function(x) x$toSimpleType())
      }
      return(InviteObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of Invite
    #'
    #' @param input_json the JSON input
    #' @return the instance of Invite
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`object`)) {
        if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("organization.invite"))) {
          stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"organization.invite\".", sep = ""))
        }
        self$`object` <- this_object$`object`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
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
      if (!is.null(this_object$`status`)) {
        if (!is.null(this_object$`status`) && !(this_object$`status` %in% c("accepted", "expired", "pending"))) {
          stop(paste("Error! \"", this_object$`status`, "\" cannot be assigned to `status`. Must be \"accepted\", \"expired\", \"pending\".", sep = ""))
        }
        self$`status` <- this_object$`status`
      }
      if (!is.null(this_object$`invited_at`)) {
        self$`invited_at` <- this_object$`invited_at`
      }
      if (!is.null(this_object$`expires_at`)) {
        self$`expires_at` <- this_object$`expires_at`
      }
      if (!is.null(this_object$`accepted_at`)) {
        self$`accepted_at` <- this_object$`accepted_at`
      }
      if (!is.null(this_object$`projects`)) {
        self$`projects` <- ApiClient$new()$deserializeObj(this_object$`projects`, "array[InviteProjectsInner]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return Invite in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of Invite
    #'
    #' @param input_json the JSON input
    #' @return the instance of Invite
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("organization.invite"))) {
        stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"organization.invite\".", sep = ""))
      }
      self$`object` <- this_object$`object`
      self$`id` <- this_object$`id`
      self$`email` <- this_object$`email`
      if (!is.null(this_object$`role`) && !(this_object$`role` %in% c("owner", "reader"))) {
        stop(paste("Error! \"", this_object$`role`, "\" cannot be assigned to `role`. Must be \"owner\", \"reader\".", sep = ""))
      }
      self$`role` <- this_object$`role`
      if (!is.null(this_object$`status`) && !(this_object$`status` %in% c("accepted", "expired", "pending"))) {
        stop(paste("Error! \"", this_object$`status`, "\" cannot be assigned to `status`. Must be \"accepted\", \"expired\", \"pending\".", sep = ""))
      }
      self$`status` <- this_object$`status`
      self$`invited_at` <- this_object$`invited_at`
      self$`expires_at` <- this_object$`expires_at`
      self$`accepted_at` <- this_object$`accepted_at`
      self$`projects` <- ApiClient$new()$deserializeObj(this_object$`projects`, "array[InviteProjectsInner]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to Invite and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for Invite: the required field `object` is missing."))
      }
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.character(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Invite: the required field `id` is missing."))
      }
      # check the required field `email`
      if (!is.null(input_json$`email`)) {
        if (!(is.character(input_json$`email`) && length(input_json$`email`) == 1)) {
          stop(paste("Error! Invalid data for `email`. Must be a string:", input_json$`email`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Invite: the required field `email` is missing."))
      }
      # check the required field `role`
      if (!is.null(input_json$`role`)) {
        if (!(is.character(input_json$`role`) && length(input_json$`role`) == 1)) {
          stop(paste("Error! Invalid data for `role`. Must be a string:", input_json$`role`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Invite: the required field `role` is missing."))
      }
      # check the required field `status`
      if (!is.null(input_json$`status`)) {
        if (!(is.character(input_json$`status`) && length(input_json$`status`) == 1)) {
          stop(paste("Error! Invalid data for `status`. Must be a string:", input_json$`status`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Invite: the required field `status` is missing."))
      }
      # check the required field `invited_at`
      if (!is.null(input_json$`invited_at`)) {
        if (!(is.numeric(input_json$`invited_at`) && length(input_json$`invited_at`) == 1)) {
          stop(paste("Error! Invalid data for `invited_at`. Must be an integer:", input_json$`invited_at`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Invite: the required field `invited_at` is missing."))
      }
      # check the required field `expires_at`
      if (!is.null(input_json$`expires_at`)) {
        if (!(is.numeric(input_json$`expires_at`) && length(input_json$`expires_at`) == 1)) {
          stop(paste("Error! Invalid data for `expires_at`. Must be an integer:", input_json$`expires_at`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Invite: the required field `expires_at` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of Invite
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

      # check if the required `email` is null
      if (is.null(self$`email`)) {
        return(FALSE)
      }

      # check if the required `role` is null
      if (is.null(self$`role`)) {
        return(FALSE)
      }

      # check if the required `status` is null
      if (is.null(self$`status`)) {
        return(FALSE)
      }

      # check if the required `invited_at` is null
      if (is.null(self$`invited_at`)) {
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
      # check if the required `object` is null
      if (is.null(self$`object`)) {
        invalid_fields["object"] <- "Non-nullable required field `object` cannot be null."
      }

      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
      }

      # check if the required `email` is null
      if (is.null(self$`email`)) {
        invalid_fields["email"] <- "Non-nullable required field `email` cannot be null."
      }

      # check if the required `role` is null
      if (is.null(self$`role`)) {
        invalid_fields["role"] <- "Non-nullable required field `role` cannot be null."
      }

      # check if the required `status` is null
      if (is.null(self$`status`)) {
        invalid_fields["status"] <- "Non-nullable required field `status` cannot be null."
      }

      # check if the required `invited_at` is null
      if (is.null(self$`invited_at`)) {
        invalid_fields["invited_at"] <- "Non-nullable required field `invited_at` cannot be null."
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
# Invite$unlock()
#
## Below is an example to define the print function
# Invite$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# Invite$lock()

