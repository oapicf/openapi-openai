
/*
 * RunCompletionUsage.h
 *
 * Usage statistics related to the run. This value will be &#x60;null&#x60; if the run is not in a terminal state (i.e. &#x60;in_progress&#x60;, &#x60;queued&#x60;, etc.).
 */

#ifndef TINY_CPP_CLIENT_RunCompletionUsage_H_
#define TINY_CPP_CLIENT_RunCompletionUsage_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Usage statistics related to the run. This value will be `null` if the run is not in a terminal state (i.e. `in_progress`, `queued`, etc.).
 *
 *  \ingroup Models
 *
 */

class RunCompletionUsage{
public:

    /*! \brief Constructor.
	 */
    RunCompletionUsage();
    RunCompletionUsage(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RunCompletionUsage();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Number of completion tokens used over the course of the run.
	 */
	int getCompletionTokens();

	/*! \brief Set Number of completion tokens used over the course of the run.
	 */
	void setCompletionTokens(int  completion_tokens);
	/*! \brief Get Number of prompt tokens used over the course of the run.
	 */
	int getPromptTokens();

	/*! \brief Set Number of prompt tokens used over the course of the run.
	 */
	void setPromptTokens(int  prompt_tokens);
	/*! \brief Get Total number of tokens used (prompt + completion).
	 */
	int getTotalTokens();

	/*! \brief Set Total number of tokens used (prompt + completion).
	 */
	void setTotalTokens(int  total_tokens);


    private:
    int completion_tokens{};
    int prompt_tokens{};
    int total_tokens{};
};
}

#endif /* TINY_CPP_CLIENT_RunCompletionUsage_H_ */
