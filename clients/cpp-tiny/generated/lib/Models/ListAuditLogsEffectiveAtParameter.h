
/*
 * List_audit_logs_effective_at_parameter.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_List_audit_logs_effective_at_parameter_H_
#define TINY_CPP_CLIENT_List_audit_logs_effective_at_parameter_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class List_audit_logs_effective_at_parameter{
public:

    /*! \brief Constructor.
	 */
    List_audit_logs_effective_at_parameter();
    List_audit_logs_effective_at_parameter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~List_audit_logs_effective_at_parameter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Return only events whose `effective_at` (Unix seconds) is greater than this value.
	 */
	int getGt();

	/*! \brief Set Return only events whose `effective_at` (Unix seconds) is greater than this value.
	 */
	void setGt(int  gt);
	/*! \brief Get Return only events whose `effective_at` (Unix seconds) is greater than or equal to this value.
	 */
	int getGte();

	/*! \brief Set Return only events whose `effective_at` (Unix seconds) is greater than or equal to this value.
	 */
	void setGte(int  gte);
	/*! \brief Get Return only events whose `effective_at` (Unix seconds) is less than this value.
	 */
	int getLt();

	/*! \brief Set Return only events whose `effective_at` (Unix seconds) is less than this value.
	 */
	void setLt(int  lt);
	/*! \brief Get Return only events whose `effective_at` (Unix seconds) is less than or equal to this value.
	 */
	int getLte();

	/*! \brief Set Return only events whose `effective_at` (Unix seconds) is less than or equal to this value.
	 */
	void setLte(int  lte);


    private:
    int gt{};
    int gte{};
    int lt{};
    int lte{};
};
}

#endif /* TINY_CPP_CLIENT_List_audit_logs_effective_at_parameter_H_ */
