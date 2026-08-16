
/*
 * RunStepDetailsToolCallsFileSearchObject_file_search.h
 *
 * For now, this is always going to be an empty object.
 */

#ifndef TINY_CPP_CLIENT_RunStepDetailsToolCallsFileSearchObject_file_search_H_
#define TINY_CPP_CLIENT_RunStepDetailsToolCallsFileSearchObject_file_search_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "RunStepDetailsToolCallsFileSearchRankingOptionsObject.h"
#include "RunStepDetailsToolCallsFileSearchResultObject.h"
#include <list>

namespace Tiny {


/*! \brief For now, this is always going to be an empty object.
 *
 *  \ingroup Models
 *
 */

class RunStepDetailsToolCallsFileSearchObject_file_search{
public:

    /*! \brief Constructor.
	 */
    RunStepDetailsToolCallsFileSearchObject_file_search();
    RunStepDetailsToolCallsFileSearchObject_file_search(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RunStepDetailsToolCallsFileSearchObject_file_search();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::list<RunStepDetailsToolCallsFileSearchResultObject> results;
};
}

#endif /* TINY_CPP_CLIENT_RunStepDetailsToolCallsFileSearchObject_file_search_H_ */
