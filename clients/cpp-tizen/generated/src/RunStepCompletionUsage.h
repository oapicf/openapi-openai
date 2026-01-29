/*
 * RunStepCompletionUsage.h
 *
 * Usage statistics related to the run step. This value will be &#x60;null&#x60; while the run step&#39;s status is &#x60;in_progress&#x60;.
 */

#ifndef _RunStepCompletionUsage_H_
#define _RunStepCompletionUsage_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Usage statistics related to the run step. This value will be `null` while the run step's status is `in_progress`.
 *
 *  \ingroup Models
 *
 */

class RunStepCompletionUsage : public Object {
public:
	/*! \brief Constructor.
	 */
	RunStepCompletionUsage();
	RunStepCompletionUsage(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RunStepCompletionUsage();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Number of completion tokens used over the course of the run step.
	 */
	int getCompletionTokens();

	/*! \brief Set Number of completion tokens used over the course of the run step.
	 */
	void setCompletionTokens(int  completion_tokens);
	/*! \brief Get Number of prompt tokens used over the course of the run step.
	 */
	int getPromptTokens();

	/*! \brief Set Number of prompt tokens used over the course of the run step.
	 */
	void setPromptTokens(int  prompt_tokens);
	/*! \brief Get Total number of tokens used (prompt + completion).
	 */
	int getTotalTokens();

	/*! \brief Set Total number of tokens used (prompt + completion).
	 */
	void setTotalTokens(int  total_tokens);

private:
	int completion_tokens;
	int prompt_tokens;
	int total_tokens;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RunStepCompletionUsage_H_ */
