#' Create a new CreateModerationResponseResultsInnerCategories
#'
#' @description
#' A list of the categories, and whether they are flagged or not.
#'
#' @docType class
#' @title CreateModerationResponseResultsInnerCategories
#' @description CreateModerationResponseResultsInnerCategories Class
#' @format An \code{R6Class} generator object
#' @field hate Content that expresses, incites, or promotes hate based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. Hateful content aimed at non-protected groups (e.g., chess players) is harassment. character
#' @field hate/threatening Hateful content that also includes violence or serious harm towards the targeted group based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. character
#' @field harassment Content that expresses, incites, or promotes harassing language towards any target. character
#' @field harassment/threatening Harassment content that also includes violence or serious harm towards any target. character
#' @field self-harm Content that promotes, encourages, or depicts acts of self-harm, such as suicide, cutting, and eating disorders. character
#' @field self-harm/intent Content where the speaker expresses that they are engaging or intend to engage in acts of self-harm, such as suicide, cutting, and eating disorders. character
#' @field self-harm/instructions Content that encourages performing acts of self-harm, such as suicide, cutting, and eating disorders, or that gives instructions or advice on how to commit such acts. character
#' @field sexual Content meant to arouse sexual excitement, such as the description of sexual activity, or that promotes sexual services (excluding sex education and wellness). character
#' @field sexual/minors Sexual content that includes an individual who is under 18 years old. character
#' @field violence Content that depicts death, violence, or physical injury. character
#' @field violence/graphic Content that depicts death, violence, or physical injury in graphic detail. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateModerationResponseResultsInnerCategories <- R6::R6Class(
  "CreateModerationResponseResultsInnerCategories",
  public = list(
    `hate` = NULL,
    `hate/threatening` = NULL,
    `harassment` = NULL,
    `harassment/threatening` = NULL,
    `self-harm` = NULL,
    `self-harm/intent` = NULL,
    `self-harm/instructions` = NULL,
    `sexual` = NULL,
    `sexual/minors` = NULL,
    `violence` = NULL,
    `violence/graphic` = NULL,

    #' @description
    #' Initialize a new CreateModerationResponseResultsInnerCategories class.
    #'
    #' @param hate Content that expresses, incites, or promotes hate based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. Hateful content aimed at non-protected groups (e.g., chess players) is harassment.
    #' @param hate/threatening Hateful content that also includes violence or serious harm towards the targeted group based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste.
    #' @param harassment Content that expresses, incites, or promotes harassing language towards any target.
    #' @param harassment/threatening Harassment content that also includes violence or serious harm towards any target.
    #' @param self-harm Content that promotes, encourages, or depicts acts of self-harm, such as suicide, cutting, and eating disorders.
    #' @param self-harm/intent Content where the speaker expresses that they are engaging or intend to engage in acts of self-harm, such as suicide, cutting, and eating disorders.
    #' @param self-harm/instructions Content that encourages performing acts of self-harm, such as suicide, cutting, and eating disorders, or that gives instructions or advice on how to commit such acts.
    #' @param sexual Content meant to arouse sexual excitement, such as the description of sexual activity, or that promotes sexual services (excluding sex education and wellness).
    #' @param sexual/minors Sexual content that includes an individual who is under 18 years old.
    #' @param violence Content that depicts death, violence, or physical injury.
    #' @param violence/graphic Content that depicts death, violence, or physical injury in graphic detail.
    #' @param ... Other optional arguments.
    initialize = function(`hate`, `hate/threatening`, `harassment`, `harassment/threatening`, `self-harm`, `self-harm/intent`, `self-harm/instructions`, `sexual`, `sexual/minors`, `violence`, `violence/graphic`, ...) {
      if (!missing(`hate`)) {
        if (!(is.logical(`hate`) && length(`hate`) == 1)) {
          stop(paste("Error! Invalid data for `hate`. Must be a boolean:", `hate`))
        }
        self$`hate` <- `hate`
      }
      if (!missing(`hate/threatening`)) {
        if (!(is.logical(`hate/threatening`) && length(`hate/threatening`) == 1)) {
          stop(paste("Error! Invalid data for `hate/threatening`. Must be a boolean:", `hate/threatening`))
        }
        self$`hate/threatening` <- `hate/threatening`
      }
      if (!missing(`harassment`)) {
        if (!(is.logical(`harassment`) && length(`harassment`) == 1)) {
          stop(paste("Error! Invalid data for `harassment`. Must be a boolean:", `harassment`))
        }
        self$`harassment` <- `harassment`
      }
      if (!missing(`harassment/threatening`)) {
        if (!(is.logical(`harassment/threatening`) && length(`harassment/threatening`) == 1)) {
          stop(paste("Error! Invalid data for `harassment/threatening`. Must be a boolean:", `harassment/threatening`))
        }
        self$`harassment/threatening` <- `harassment/threatening`
      }
      if (!missing(`self-harm`)) {
        if (!(is.logical(`self-harm`) && length(`self-harm`) == 1)) {
          stop(paste("Error! Invalid data for `self-harm`. Must be a boolean:", `self-harm`))
        }
        self$`self-harm` <- `self-harm`
      }
      if (!missing(`self-harm/intent`)) {
        if (!(is.logical(`self-harm/intent`) && length(`self-harm/intent`) == 1)) {
          stop(paste("Error! Invalid data for `self-harm/intent`. Must be a boolean:", `self-harm/intent`))
        }
        self$`self-harm/intent` <- `self-harm/intent`
      }
      if (!missing(`self-harm/instructions`)) {
        if (!(is.logical(`self-harm/instructions`) && length(`self-harm/instructions`) == 1)) {
          stop(paste("Error! Invalid data for `self-harm/instructions`. Must be a boolean:", `self-harm/instructions`))
        }
        self$`self-harm/instructions` <- `self-harm/instructions`
      }
      if (!missing(`sexual`)) {
        if (!(is.logical(`sexual`) && length(`sexual`) == 1)) {
          stop(paste("Error! Invalid data for `sexual`. Must be a boolean:", `sexual`))
        }
        self$`sexual` <- `sexual`
      }
      if (!missing(`sexual/minors`)) {
        if (!(is.logical(`sexual/minors`) && length(`sexual/minors`) == 1)) {
          stop(paste("Error! Invalid data for `sexual/minors`. Must be a boolean:", `sexual/minors`))
        }
        self$`sexual/minors` <- `sexual/minors`
      }
      if (!missing(`violence`)) {
        if (!(is.logical(`violence`) && length(`violence`) == 1)) {
          stop(paste("Error! Invalid data for `violence`. Must be a boolean:", `violence`))
        }
        self$`violence` <- `violence`
      }
      if (!missing(`violence/graphic`)) {
        if (!(is.logical(`violence/graphic`) && length(`violence/graphic`) == 1)) {
          stop(paste("Error! Invalid data for `violence/graphic`. Must be a boolean:", `violence/graphic`))
        }
        self$`violence/graphic` <- `violence/graphic`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return CreateModerationResponseResultsInnerCategories in JSON format
    toJSON = function() {
      CreateModerationResponseResultsInnerCategoriesObject <- list()
      if (!is.null(self$`hate`)) {
        CreateModerationResponseResultsInnerCategoriesObject[["hate"]] <-
          self$`hate`
      }
      if (!is.null(self$`hate/threatening`)) {
        CreateModerationResponseResultsInnerCategoriesObject[["hate/threatening"]] <-
          self$`hate/threatening`
      }
      if (!is.null(self$`harassment`)) {
        CreateModerationResponseResultsInnerCategoriesObject[["harassment"]] <-
          self$`harassment`
      }
      if (!is.null(self$`harassment/threatening`)) {
        CreateModerationResponseResultsInnerCategoriesObject[["harassment/threatening"]] <-
          self$`harassment/threatening`
      }
      if (!is.null(self$`self-harm`)) {
        CreateModerationResponseResultsInnerCategoriesObject[["self-harm"]] <-
          self$`self-harm`
      }
      if (!is.null(self$`self-harm/intent`)) {
        CreateModerationResponseResultsInnerCategoriesObject[["self-harm/intent"]] <-
          self$`self-harm/intent`
      }
      if (!is.null(self$`self-harm/instructions`)) {
        CreateModerationResponseResultsInnerCategoriesObject[["self-harm/instructions"]] <-
          self$`self-harm/instructions`
      }
      if (!is.null(self$`sexual`)) {
        CreateModerationResponseResultsInnerCategoriesObject[["sexual"]] <-
          self$`sexual`
      }
      if (!is.null(self$`sexual/minors`)) {
        CreateModerationResponseResultsInnerCategoriesObject[["sexual/minors"]] <-
          self$`sexual/minors`
      }
      if (!is.null(self$`violence`)) {
        CreateModerationResponseResultsInnerCategoriesObject[["violence"]] <-
          self$`violence`
      }
      if (!is.null(self$`violence/graphic`)) {
        CreateModerationResponseResultsInnerCategoriesObject[["violence/graphic"]] <-
          self$`violence/graphic`
      }
      CreateModerationResponseResultsInnerCategoriesObject
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateModerationResponseResultsInnerCategories
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateModerationResponseResultsInnerCategories
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`hate`)) {
        self$`hate` <- this_object$`hate`
      }
      if (!is.null(this_object$`hate/threatening`)) {
        self$`hate/threatening` <- this_object$`hate/threatening`
      }
      if (!is.null(this_object$`harassment`)) {
        self$`harassment` <- this_object$`harassment`
      }
      if (!is.null(this_object$`harassment/threatening`)) {
        self$`harassment/threatening` <- this_object$`harassment/threatening`
      }
      if (!is.null(this_object$`self-harm`)) {
        self$`self-harm` <- this_object$`self-harm`
      }
      if (!is.null(this_object$`self-harm/intent`)) {
        self$`self-harm/intent` <- this_object$`self-harm/intent`
      }
      if (!is.null(this_object$`self-harm/instructions`)) {
        self$`self-harm/instructions` <- this_object$`self-harm/instructions`
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

    #' @description
    #' To JSON String
    #'
    #' @return CreateModerationResponseResultsInnerCategories in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`hate`)) {
          sprintf(
          '"hate":
            %s
                    ',
          tolower(self$`hate`)
          )
        },
        if (!is.null(self$`hate/threatening`)) {
          sprintf(
          '"hate/threatening":
            %s
                    ',
          tolower(self$`hate/threatening`)
          )
        },
        if (!is.null(self$`harassment`)) {
          sprintf(
          '"harassment":
            %s
                    ',
          tolower(self$`harassment`)
          )
        },
        if (!is.null(self$`harassment/threatening`)) {
          sprintf(
          '"harassment/threatening":
            %s
                    ',
          tolower(self$`harassment/threatening`)
          )
        },
        if (!is.null(self$`self-harm`)) {
          sprintf(
          '"self-harm":
            %s
                    ',
          tolower(self$`self-harm`)
          )
        },
        if (!is.null(self$`self-harm/intent`)) {
          sprintf(
          '"self-harm/intent":
            %s
                    ',
          tolower(self$`self-harm/intent`)
          )
        },
        if (!is.null(self$`self-harm/instructions`)) {
          sprintf(
          '"self-harm/instructions":
            %s
                    ',
          tolower(self$`self-harm/instructions`)
          )
        },
        if (!is.null(self$`sexual`)) {
          sprintf(
          '"sexual":
            %s
                    ',
          tolower(self$`sexual`)
          )
        },
        if (!is.null(self$`sexual/minors`)) {
          sprintf(
          '"sexual/minors":
            %s
                    ',
          tolower(self$`sexual/minors`)
          )
        },
        if (!is.null(self$`violence`)) {
          sprintf(
          '"violence":
            %s
                    ',
          tolower(self$`violence`)
          )
        },
        if (!is.null(self$`violence/graphic`)) {
          sprintf(
          '"violence/graphic":
            %s
                    ',
          tolower(self$`violence/graphic`)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateModerationResponseResultsInnerCategories
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateModerationResponseResultsInnerCategories
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`hate` <- this_object$`hate`
      self$`hate/threatening` <- this_object$`hate/threatening`
      self$`harassment` <- this_object$`harassment`
      self$`harassment/threatening` <- this_object$`harassment/threatening`
      self$`self-harm` <- this_object$`self-harm`
      self$`self-harm/intent` <- this_object$`self-harm/intent`
      self$`self-harm/instructions` <- this_object$`self-harm/instructions`
      self$`sexual` <- this_object$`sexual`
      self$`sexual/minors` <- this_object$`sexual/minors`
      self$`violence` <- this_object$`violence`
      self$`violence/graphic` <- this_object$`violence/graphic`
      self
    },

    #' @description
    #' Validate JSON input with respect to CreateModerationResponseResultsInnerCategories and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `hate`
      if (!is.null(input_json$`hate`)) {
        if (!(is.logical(input_json$`hate`) && length(input_json$`hate`) == 1)) {
          stop(paste("Error! Invalid data for `hate`. Must be a boolean:", input_json$`hate`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateModerationResponseResultsInnerCategories: the required field `hate` is missing."))
      }
      # check the required field `hate/threatening`
      if (!is.null(input_json$`hate/threatening`)) {
        if (!(is.logical(input_json$`hate/threatening`) && length(input_json$`hate/threatening`) == 1)) {
          stop(paste("Error! Invalid data for `hate/threatening`. Must be a boolean:", input_json$`hate/threatening`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateModerationResponseResultsInnerCategories: the required field `hate/threatening` is missing."))
      }
      # check the required field `harassment`
      if (!is.null(input_json$`harassment`)) {
        if (!(is.logical(input_json$`harassment`) && length(input_json$`harassment`) == 1)) {
          stop(paste("Error! Invalid data for `harassment`. Must be a boolean:", input_json$`harassment`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateModerationResponseResultsInnerCategories: the required field `harassment` is missing."))
      }
      # check the required field `harassment/threatening`
      if (!is.null(input_json$`harassment/threatening`)) {
        if (!(is.logical(input_json$`harassment/threatening`) && length(input_json$`harassment/threatening`) == 1)) {
          stop(paste("Error! Invalid data for `harassment/threatening`. Must be a boolean:", input_json$`harassment/threatening`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateModerationResponseResultsInnerCategories: the required field `harassment/threatening` is missing."))
      }
      # check the required field `self-harm`
      if (!is.null(input_json$`self-harm`)) {
        if (!(is.logical(input_json$`self-harm`) && length(input_json$`self-harm`) == 1)) {
          stop(paste("Error! Invalid data for `self-harm`. Must be a boolean:", input_json$`self-harm`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateModerationResponseResultsInnerCategories: the required field `self-harm` is missing."))
      }
      # check the required field `self-harm/intent`
      if (!is.null(input_json$`self-harm/intent`)) {
        if (!(is.logical(input_json$`self-harm/intent`) && length(input_json$`self-harm/intent`) == 1)) {
          stop(paste("Error! Invalid data for `self-harm/intent`. Must be a boolean:", input_json$`self-harm/intent`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateModerationResponseResultsInnerCategories: the required field `self-harm/intent` is missing."))
      }
      # check the required field `self-harm/instructions`
      if (!is.null(input_json$`self-harm/instructions`)) {
        if (!(is.logical(input_json$`self-harm/instructions`) && length(input_json$`self-harm/instructions`) == 1)) {
          stop(paste("Error! Invalid data for `self-harm/instructions`. Must be a boolean:", input_json$`self-harm/instructions`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateModerationResponseResultsInnerCategories: the required field `self-harm/instructions` is missing."))
      }
      # check the required field `sexual`
      if (!is.null(input_json$`sexual`)) {
        if (!(is.logical(input_json$`sexual`) && length(input_json$`sexual`) == 1)) {
          stop(paste("Error! Invalid data for `sexual`. Must be a boolean:", input_json$`sexual`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateModerationResponseResultsInnerCategories: the required field `sexual` is missing."))
      }
      # check the required field `sexual/minors`
      if (!is.null(input_json$`sexual/minors`)) {
        if (!(is.logical(input_json$`sexual/minors`) && length(input_json$`sexual/minors`) == 1)) {
          stop(paste("Error! Invalid data for `sexual/minors`. Must be a boolean:", input_json$`sexual/minors`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateModerationResponseResultsInnerCategories: the required field `sexual/minors` is missing."))
      }
      # check the required field `violence`
      if (!is.null(input_json$`violence`)) {
        if (!(is.logical(input_json$`violence`) && length(input_json$`violence`) == 1)) {
          stop(paste("Error! Invalid data for `violence`. Must be a boolean:", input_json$`violence`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateModerationResponseResultsInnerCategories: the required field `violence` is missing."))
      }
      # check the required field `violence/graphic`
      if (!is.null(input_json$`violence/graphic`)) {
        if (!(is.logical(input_json$`violence/graphic`) && length(input_json$`violence/graphic`) == 1)) {
          stop(paste("Error! Invalid data for `violence/graphic`. Must be a boolean:", input_json$`violence/graphic`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateModerationResponseResultsInnerCategories: the required field `violence/graphic` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateModerationResponseResultsInnerCategories
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `hate` is null
      if (is.null(self$`hate`)) {
        return(FALSE)
      }

      # check if the required `hate/threatening` is null
      if (is.null(self$`hate/threatening`)) {
        return(FALSE)
      }

      # check if the required `harassment` is null
      if (is.null(self$`harassment`)) {
        return(FALSE)
      }

      # check if the required `harassment/threatening` is null
      if (is.null(self$`harassment/threatening`)) {
        return(FALSE)
      }

      # check if the required `self-harm` is null
      if (is.null(self$`self-harm`)) {
        return(FALSE)
      }

      # check if the required `self-harm/intent` is null
      if (is.null(self$`self-harm/intent`)) {
        return(FALSE)
      }

      # check if the required `self-harm/instructions` is null
      if (is.null(self$`self-harm/instructions`)) {
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

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
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

      # check if the required `harassment` is null
      if (is.null(self$`harassment`)) {
        invalid_fields["harassment"] <- "Non-nullable required field `harassment` cannot be null."
      }

      # check if the required `harassment/threatening` is null
      if (is.null(self$`harassment/threatening`)) {
        invalid_fields["harassment/threatening"] <- "Non-nullable required field `harassment/threatening` cannot be null."
      }

      # check if the required `self-harm` is null
      if (is.null(self$`self-harm`)) {
        invalid_fields["self-harm"] <- "Non-nullable required field `self-harm` cannot be null."
      }

      # check if the required `self-harm/intent` is null
      if (is.null(self$`self-harm/intent`)) {
        invalid_fields["self-harm/intent"] <- "Non-nullable required field `self-harm/intent` cannot be null."
      }

      # check if the required `self-harm/instructions` is null
      if (is.null(self$`self-harm/instructions`)) {
        invalid_fields["self-harm/instructions"] <- "Non-nullable required field `self-harm/instructions` cannot be null."
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
# CreateModerationResponseResultsInnerCategories$unlock()
#
## Below is an example to define the print function
# CreateModerationResponseResultsInnerCategories$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateModerationResponseResultsInnerCategories$lock()

