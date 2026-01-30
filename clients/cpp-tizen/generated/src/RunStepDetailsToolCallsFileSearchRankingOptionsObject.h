/*
 * RunStepDetailsToolCallsFileSearchRankingOptionsObject.h
 *
 * The ranking options for the file search.
 */

#ifndef _RunStepDetailsToolCallsFileSearchRankingOptionsObject_H_
#define _RunStepDetailsToolCallsFileSearchRankingOptionsObject_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The ranking options for the file search.
 *
 *  \ingroup Models
 *
 */

class RunStepDetailsToolCallsFileSearchRankingOptionsObject : public Object {
public:
	/*! \brief Constructor.
	 */
	RunStepDetailsToolCallsFileSearchRankingOptionsObject();
	RunStepDetailsToolCallsFileSearchRankingOptionsObject(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RunStepDetailsToolCallsFileSearchRankingOptionsObject();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The ranker used for the file search.
	 */
	std::string getRanker();

	/*! \brief Set The ranker used for the file search.
	 */
	void setRanker(std::string  ranker);
	/*! \brief Get The score threshold for the file search. All values must be a floating point number between 0 and 1.
	 */
	long long getScoreThreshold();

	/*! \brief Set The score threshold for the file search. All values must be a floating point number between 0 and 1.
	 */
	void setScoreThreshold(long long  score_threshold);

private:
	std::string ranker;
	long long score_threshold;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RunStepDetailsToolCallsFileSearchRankingOptionsObject_H_ */
