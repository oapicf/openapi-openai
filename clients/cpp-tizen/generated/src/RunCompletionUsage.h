/*
 * RunCompletionUsage.h
 *
 * Usage statistics related to the run. This value will be &#x60;null&#x60; if the run is not in a terminal state (i.e. &#x60;in_progress&#x60;, &#x60;queued&#x60;, etc.).
 */

#ifndef _RunCompletionUsage_H_
#define _RunCompletionUsage_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Usage statistics related to the run. This value will be `null` if the run is not in a terminal state (i.e. `in_progress`, `queued`, etc.).
 *
 *  \ingroup Models
 *
 */

class RunCompletionUsage : public Object {
public:
	/*! \brief Constructor.
	 */
	RunCompletionUsage();
	RunCompletionUsage(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RunCompletionUsage();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	int completion_tokens;
	int prompt_tokens;
	int total_tokens;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RunCompletionUsage_H_ */
