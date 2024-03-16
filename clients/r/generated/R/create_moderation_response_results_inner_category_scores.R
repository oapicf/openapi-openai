#' Create a new CreateModerationResponseResultsInnerCategoryScores
#'
#' @description
#' CreateModerationResponseResultsInnerCategoryScores Class
#'
#' @docType class
#' @title CreateModerationResponseResultsInnerCategoryScores
#' @description CreateModerationResponseResultsInnerCategoryScores Class
#' @format An \code{R6Class} generator object
#' @field hate  numeric
#' @field hate/threatening  numeric
#' @field self-harm  numeric
#' @field sexual  numeric
#' @field sexual/minors  numeric
#' @field violence  numeric
#' @field violence/graphic  numeric
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateModerationResponseResultsInnerCategoryScores <- R6::R6Class(
  "CreateModerationResponseResultsInnerCategoryScores",
  public = list(
    `hate` = NULL,
    `hate/threatening` = NULL,
    `self-harm` = NULL,
    `sexual` = NULL,
    `sexual/minors` = NULL,
    `violence` = NULL,
    `violence/graphic` = NULL,
    #' Initialize a new CreateModerationResponseResultsInnerCategoryScores class.
    #'
    #' @description
    #' Initialize a new CreateModerationResponseResultsInnerCategoryScores class.
    #'
    #' @param hate hate
    #' @param hate/threatening hate/threatening
    #' @param self-harm self-harm
    #' @param sexual sexual
    #' @param sexual/minors sexual/minors
    #' @param violence violence
    #' @param violence/graphic violence/graphic
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`hate`, `hate/threatening`, `self-harm`, `sexual`, `sexual/minors`, `violence`, `violence/graphic`, ...) {
      if (!missing(`hate`)) {
        self$`hate` <- `hate`
      }
      if (!missing(`hate/threatening`)) {
        self$`hate/threatening` <- `hate/threatening`
      }
      if (!missing(`self-harm`)) {
        self$`self-harm` <- `self-harm`
      }
      if (!missing(`sexual`)) {
        self$`sexual` <- `sexual`
      }
      if (!missing(`sexual/minors`)) {
        self$`sexual/minors` <- `sexual/minors`
      }
      if (!missing(`violence`)) {
        self$`violence` <- `violence`
      }
      if (!missing(`violence/graphic`)) {
        self$`violence/graphic` <- `violence/graphic`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CreateModerationResponseResultsInnerCategoryScores in JSON format
    #' @export
    toJSON = function() {
      CreateModerationResponseResultsInnerCategoryScoresObject <- list()
      if (!is.null(self$`hate`)) {
        CreateModerationResponseResultsInnerCategoryScoresObject[["hate"]] <-
          self$`hate`
      }
      if (!is.null(self$`hate/threatening`)) {
        CreateModerationResponseResultsInnerCategoryScoresObject[["hate/threatening"]] <-
          self$`hate/threatening`
      }
      if (!is.null(self$`self-harm`)) {
        CreateModerationResponseResultsInnerCategoryScoresObject[["self-harm"]] <-
          self$`self-harm`
      }
      if (!is.null(self$`sexual`)) {
        CreateModerationResponseResultsInnerCategoryScoresObject[["sexual"]] <-
          self$`sexual`
      }
      if (!is.null(self$`sexual/minors`)) {
        CreateModerationResponseResultsInnerCategoryScoresObject[["sexual/minors"]] <-
          self$`sexual/minors`
      }
      if (!is.null(self$`violence`)) {
        CreateModerationResponseResultsInnerCategoryScoresObject[["violence"]] <-
          self$`violence`
      }
      if (!is.null(self$`violence/graphic`)) {
        CreateModerationResponseResultsInnerCategoryScoresObject[["violence/graphic"]] <-
          self$`violence/graphic`
      }
      CreateModerationResponseResultsInnerCategoryScoresObject
    },
    #' Deserialize JSON string into an instance of CreateModerationResponseResultsInnerCategoryScores
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateModerationResponseResultsInnerCategoryScores
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateModerationResponseResultsInnerCategoryScores
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`hate`)) {
        self$`hate` <- this_object$`hate`
      }
      if (!is.null(this_object$`hate/threatening`)) {
        self$`hate/threatening` <- this_object$`hate/threatening`
      }
      if (!is.null(this_object$`self-harm`)) {
        self$`self-harm` <- this_object$`self-harm`
      }
      if (!is.null(this_object$`sexual`)) {
        self$`sexual` <- this_object$`sexual`
      }
      if (!is.null(this_object$`sexual/minors`)) {
        self$`sexual/minors` <- this_object$`sexual/minors`
      }
      if (!is.null(this_object$`violence`)) {
        self$`violence` <- this_object$`violence`
      }
      if (!is.null(this_object$`violence/graphic`)) {
        self$`violence/graphic` <- this_object$`violence/graphic`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CreateModerationResponseResultsInnerCategoryScores in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`hate`)) {
          sprintf(
          '"hate":
            %d
                    ',
          self$`hate`
          )
        },
        if (!is.null(self$`hate/threatening`)) {
          sprintf(
          '"hate/threatening":
            %d
                    ',
          self$`hate/threatening`
          )
        },
        if (!is.null(self$`self-harm`)) {
          sprintf(
          '"self-harm":
            %d
                    ',
          self$`self-harm`
          )
        },
        if (!is.null(self$`sexual`)) {
          sprintf(
          '"sexual":
            %d
                    ',
          self$`sexual`
          )
        },
        if (!is.null(self$`sexual/minors`)) {
          sprintf(
          '"sexual/minors":
            %d
                    ',
          self$`sexual/minors`
          )
        },
        if (!is.null(self$`violence`)) {
          sprintf(
          '"violence":
            %d
                    ',
          self$`violence`
          )
        },
        if (!is.null(self$`violence/graphic`)) {
          sprintf(
          '"violence/graphic":
            %d
                    ',
          self$`violence/graphic`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CreateModerationResponseResultsInnerCategoryScores
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateModerationResponseResultsInnerCategoryScores
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateModerationResponseResultsInnerCategoryScores
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`hate` <- this_object$`hate`
      self$`hate/threatening` <- this_object$`hate/threatening`
      self$`self-harm` <- this_object$`self-harm`
      self$`sexual` <- this_object$`sexual`
      self$`sexual/minors` <- this_object$`sexual/minors`
      self$`violence` <- this_object$`violence`
      self$`violence/graphic` <- this_object$`violence/graphic`
      self
    },
    #' Validate JSON input with respect to CreateModerationResponseResultsInnerCategoryScores
    #'
    #' @description
    #' Validate JSON input with respect to CreateModerationResponseResultsInnerCategoryScores and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `hate`
      if (!is.null(input_json$`hate`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateModerationResponseResultsInnerCategoryScores: the required field `hate` is missing."))
      }
      # check the required field `hate/threatening`
      if (!is.null(input_json$`hate/threatening`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateModerationResponseResultsInnerCategoryScores: the required field `hate/threatening` is missing."))
      }
      # check the required field `self-harm`
      if (!is.null(input_json$`self-harm`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateModerationResponseResultsInnerCategoryScores: the required field `self-harm` is missing."))
      }
      # check the required field `sexual`
      if (!is.null(input_json$`sexual`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateModerationResponseResultsInnerCategoryScores: the required field `sexual` is missing."))
      }
      # check the required field `sexual/minors`
      if (!is.null(input_json$`sexual/minors`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateModerationResponseResultsInnerCategoryScores: the required field `sexual/minors` is missing."))
      }
      # check the required field `violence`
      if (!is.null(input_json$`violence`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateModerationResponseResultsInnerCategoryScores: the required field `violence` is missing."))
      }
      # check the required field `violence/graphic`
      if (!is.null(input_json$`violence/graphic`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateModerationResponseResultsInnerCategoryScores: the required field `violence/graphic` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateModerationResponseResultsInnerCategoryScores
    #' @export
    toString = function() {
      self$toJSONString()
    },
    #' Return true if the values in all fields are valid.
    #'
    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    #' @export
    isValid = function() {
      # check if the required `hate` is null
      if (is.null(self$`hate`)) {
        return(FALSE)
      }

      # check if the required `hate/threatening` is null
      if (is.null(self$`hate/threatening`)) {
        return(FALSE)
      }

      # check if the required `self-harm` is null
      if (is.null(self$`self-harm`)) {
        return(FALSE)
      }

      # check if the required `sexual` is null
      if (is.null(self$`sexual`)) {
        return(FALSE)
      }

      # check if the required `sexual/minors` is null
      if (is.null(self$`sexual/minors`)) {
        return(FALSE)
      }

      # check if the required `violence` is null
      if (is.null(self$`violence`)) {
        return(FALSE)
      }

      # check if the required `violence/graphic` is null
      if (is.null(self$`violence/graphic`)) {
        return(FALSE)
      }

      TRUE
    },
    #' Return a list of invalid fields (if any).
    #'
    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    #' @export
    getInvalidFields = function() {
      invalid_fields <- list()
      # check if the required `hate` is null
      if (is.null(self$`hate`)) {
        invalid_fields["hate"] <- "Non-nullable required field `hate` cannot be null."
      }

      # check if the required `hate/threatening` is null
      if (is.null(self$`hate/threatening`)) {
        invalid_fields["hate/threatening"] <- "Non-nullable required field `hate/threatening` cannot be null."
      }

      # check if the required `self-harm` is null
      if (is.null(self$`self-harm`)) {
        invalid_fields["self-harm"] <- "Non-nullable required field `self-harm` cannot be null."
      }

      # check if the required `sexual` is null
      if (is.null(self$`sexual`)) {
        invalid_fields["sexual"] <- "Non-nullable required field `sexual` cannot be null."
      }

      # check if the required `sexual/minors` is null
      if (is.null(self$`sexual/minors`)) {
        invalid_fields["sexual/minors"] <- "Non-nullable required field `sexual/minors` cannot be null."
      }

      # check if the required `violence` is null
      if (is.null(self$`violence`)) {
        invalid_fields["violence"] <- "Non-nullable required field `violence` cannot be null."
      }

      # check if the required `violence/graphic` is null
      if (is.null(self$`violence/graphic`)) {
        invalid_fields["violence/graphic"] <- "Non-nullable required field `violence/graphic` cannot be null."
      }

      invalid_fields
    },
    #' Print the object
    #'
    #' @description
    #' Print the object
    #'
    #' @export
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# CreateModerationResponseResultsInnerCategoryScores$unlock()
#
## Below is an example to define the print function
# CreateModerationResponseResultsInnerCategoryScores$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateModerationResponseResultsInnerCategoryScores$lock()

