
/*
 * ListRunStepsResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ListRunStepsResponse_H_
#define TINY_CPP_CLIENT_ListRunStepsResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "RunStepObject.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ListRunStepsResponse{
public:

    /*! \brief Constructor.
	 */
    ListRunStepsResponse();
    ListRunStepsResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ListRunStepsResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getObject();

	/*! \brief Set 
	 */
	void setObject(std::string  object);
	/*! \brief Get 
	 */
	std::list<RunStepObject> getData();

	/*! \brief Set 
	 */
	void setData(std::list <RunStepObject> data);
	/*! \brief Get 
	 */
	std::string getFirstId();

	/*! \brief Set 
	 */
	void setFirstId(std::string  first_id);
	/*! \brief Get 
	 */
	std::string getLastId();

	/*! \brief Set 
	 */
	void setLastId(std::string  last_id);
	/*! \brief Get 
	 */
	bool isHasMore();

	/*! \brief Set 
	 */
	void setHasMore(bool  has_more);


    private:
    std::string object{};
    std::list<RunStepObject> data;
    std::string first_id{};
    std::string last_id{};
    bool has_more{};
};
}

#endif /* TINY_CPP_CLIENT_ListRunStepsResponse_H_ */
