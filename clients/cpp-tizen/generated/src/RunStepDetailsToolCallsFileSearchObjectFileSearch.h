/*
 * RunStepDetailsToolCallsFileSearchObject_file_search.h
 *
 * For now, this is always going to be an empty object.
 */

#ifndef _RunStepDetailsToolCallsFileSearchObject_file_search_H_
#define _RunStepDetailsToolCallsFileSearchObject_file_search_H_


#include <string>
#include "RunStepDetailsToolCallsFileSearchRankingOptionsObject.h"
#include "RunStepDetailsToolCallsFileSearchResultObject.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief For now, this is always going to be an empty object.
 *
 *  \ingroup Models
 *
 */

class RunStepDetailsToolCallsFileSearchObject_file_search : public Object {
public:
	/*! \brief Constructor.
	 */
	RunStepDetailsToolCallsFileSearchObject_file_search();
	RunStepDetailsToolCallsFileSearchObject_file_search(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RunStepDetailsToolCallsFileSearchObject_file_search();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	RunStepDetailsToolCallsFileSearchRankingOptionsObject getRankingOptions();

	/*! \brief Set 
	 */
	void setRankingOptions(RunStepDetailsToolCallsFileSearchRankingOptionsObject  ranking_options);
	/*! \brief Get The results of the file search.
	 */
	std::list<RunStepDetailsToolCallsFileSearchResultObject> getResults();

	/*! \brief Set The results of the file search.
	 */
	void setResults(std::list <RunStepDetailsToolCallsFileSearchResultObject> results);

private:
	RunStepDetailsToolCallsFileSearchRankingOptionsObject ranking_options;
	std::list <RunStepDetailsToolCallsFileSearchResultObject>results;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RunStepDetailsToolCallsFileSearchObject_file_search_H_ */
